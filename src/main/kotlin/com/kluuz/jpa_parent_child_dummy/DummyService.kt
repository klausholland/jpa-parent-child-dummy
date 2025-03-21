package com.kluuz.jpa_parent_child_dummy

import org.springframework.stereotype.Service

@Service
class DummyService(
    private val dummyRepository: ParentRepository
) {


    fun updateChildren() {
        val parent = dummyRepository.findAll().get(0);

        parent.children.find { it.pending }?.let {
            it.active = !it.active
        }

        dummyRepository.saveAndFlush(parent)
    }
}