package com.example.kotlin.data

/*
 * Copyright 2014 Intel Corporation. All rights reserved.
 * License: BSD-3-clause-Intel, see LICENSE.txt
 */

import android.provider.BaseColumns
import com.annotatedsql.annotation.provider.Provider
import com.annotatedsql.annotation.provider.URI
import com.annotatedsql.annotation.sql.*
import com.annotatedsql.annotation.sql.Column.Type

@Schema(className = "ContactsSchema", dbName = "contacts.db", dbVersion = 2)
@Provider(authority = "com.collabora.xwperf.notxw_contacts.data", name = "ContactsContentProvider", schemaClass = "ContactsSchema")
interface ContactsStore {

    @Table(ContactTable.TABLE_NAME)
    interface ContactTable {
        companion object {
            const val TABLE_NAME = "contactsTable"

            @URI
            const val CONTENT_URI = "contact"

            @PrimaryKey
            @Autoincrement
            @Column(type = Type.INTEGER)
            const val ID = BaseColumns._ID

            @NotNull
            @Column(type = Type.TEXT)
            const val NAME = "forename"

            @Column(type = Type.TEXT)
            const val EMAIL = "email"

            @Column(type = Type.INTEGER)
            const val AVATAR = "avatar"

            @Column(type = Type.TEXT)
            const val PHONE = "phone"

            @Column(type = Type.REAL)
            const val BIRTHDAY = "birthday"

            @Column(type = Type.INTEGER)
            const val FAVORITE = "favorite"
        }
    }
}


