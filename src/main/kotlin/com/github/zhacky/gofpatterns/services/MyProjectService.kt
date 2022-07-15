package com.github.zhacky.gofpatterns.services

import com.intellij.openapi.project.Project
import com.github.zhacky.gofpatterns.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
