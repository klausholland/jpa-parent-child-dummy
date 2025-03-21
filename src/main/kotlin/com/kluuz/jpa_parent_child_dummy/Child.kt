package com.kluuz.jpa_parent_child_dummy

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "child")
class Child {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    var id: UUID? = null

    @Column(name = "name")
    lateinit var name: String

    @Column(name = "active")
    var active: Boolean = false

    @Column(name = "pending")
    var pending: Boolean = false

    @ManyToOne(fetch = FetchType.EAGER, cascade = [CascadeType.ALL])
    @JoinColumn(name = "parent_id")
    lateinit var parent: Parent

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    lateinit var type: ChildType


}
