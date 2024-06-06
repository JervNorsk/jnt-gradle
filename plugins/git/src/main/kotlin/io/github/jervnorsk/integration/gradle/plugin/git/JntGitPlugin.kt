package io.github.jervnorsk.integration.gradle.plugin.git

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.internal.project.ProjectInternal
import org.gradle.kotlin.dsl.PluginDependenciesSpecScope

open class JntGitPlugin : Plugin<Project> {

    val version
        get() = Runtime.getRuntime()
            .exec(
                arrayOf("git", "describe", "--tags", "--always")
            )
            .inputReader()
            .readText()

    override fun apply(project: Project) {
        project.version = version
    }
}

fun PluginDependenciesSpecScope.jnt(module: String) =
    id("jnt-$module")

val ProjectInternal.git
    get() = plugins.getPlugin(JntGitPlugin::class.java)
