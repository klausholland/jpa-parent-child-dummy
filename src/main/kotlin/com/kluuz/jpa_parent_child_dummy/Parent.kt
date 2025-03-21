package com.kluuz.jpa_parent_child_dummy

import jakarta.persistence.*
import java.util.UUID

@Entity
@Table(name = "parent")
class Parent {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    var id: UUID? = null

    @Column(name = "name")
    lateinit var name: String

    @OneToMany(mappedBy = "parent", cascade = [CascadeType.ALL], fetch = FetchType.EAGER, orphanRemoval = true)
    var children: MutableList<Child> = mutableListOf()


}