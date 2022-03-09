/*
 * Nextcloud Talk application
 *
 * @author Marcel Hibbe
 * Copyright (C) 2022 Marcel Hibbe <dev@mhibbe.de>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.nextcloud.talk.events

import android.os.Bundle
import com.nextcloud.talk.models.json.conversations.Conversation

class OpenConversationEvent {
    var conversation: Conversation? = null
    var bundle: Bundle? = null

    constructor(conversation: Conversation?, bundle: Bundle?) {
        this.conversation = conversation
        this.bundle = bundle
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as OpenConversationEvent

        if (conversation != other.conversation) return false
        if (bundle != other.bundle) return false

        return true
    }

    override fun hashCode(): Int {
        var result = conversation?.hashCode() ?: 0
        result = 31 * result + (bundle?.hashCode() ?: 0)
        return result
    }
}