package com.github.josephkrupinsky.testplugin.services

import com.intellij.openapi.project.Project
import com.github.josephkrupinsky.testplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
