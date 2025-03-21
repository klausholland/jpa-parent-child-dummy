package com.kluuz.jpa_parent_child_dummy

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface ParentRepository: JpaRepository<Parent, UUID> {
}