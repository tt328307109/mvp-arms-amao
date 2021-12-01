package com.github.tt328307109.mvparmsamao.services

import com.intellij.openapi.project.Project
import com.github.tt328307109.mvparmsamao.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
