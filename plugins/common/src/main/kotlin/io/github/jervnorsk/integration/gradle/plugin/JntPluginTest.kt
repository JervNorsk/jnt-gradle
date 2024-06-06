package io.github.jervnorsk.integration.gradle.plugin

import org.gradle.api.Project
import org.gradle.api.internal.project.ProjectInternal
import org.gradle.testfixtures.ProjectBuilder

interface JntPluginTest {

    fun buildProject(
        projectBuilder: ProjectBuilder.() -> Unit = { },
        configureProject: Project.() -> Unit = {},
    ): ProjectInternal = ProjectBuilder
        .builder()
        .apply(projectBuilder)
        .build()
        //temporary solution for BuildEventsListenerRegistry
//    .also { addBuildEventsListenerRegistryMock(it) }
//    .also { disableDownloadingKonanFromMavenCentral(it) }
        .apply(configureProject)
        .let { it as ProjectInternal }

}
