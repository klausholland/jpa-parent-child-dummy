package com.kluuz.jpa_parent_child_dummy

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DummyController(
    private val dummyService: DummyService
) {

    @PostMapping("/inject")
    fun dummyInject() {
        dummyService.updateChildren();
    }

}