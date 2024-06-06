package io.github.jervnorsk.integration.gradle.plugin.git

import org.gradle.api.Project
import org.gradle.api.internal.project.ProjectInternal
import org.gradle.testfixtures.ProjectBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test

fun buildProject(
    projectBuilder: ProjectBuilder.() -> Unit = { },
    configureProject: Project.() -> Unit = {},
): ProjectInternal = ProjectBuilder
    .builder()
    .apply(projectBuilder)
    .build()
    .apply(configureProject)
    .let { it as ProjectInternal }

class JntGitPluginTest {

    private val project
        get() = buildProject {
            plugins.apply(JntGitPlugin::class.java)
        }

    @Test
    fun `test - project extension must be present`() {
        assertNotNull(project.git)
    }

    @Test
    fun `test - project version must be set by plugin`() {
        assertEquals(project.version, project.git.version)
    }
}
