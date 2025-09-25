/*
 * This file is part of Compass.
 * Copyright (C) 2021 Philipp Bobek <philipp.bobek@mailbox.org>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Compass is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.bobek.compass.model

import androidx.annotation.StringRes
import com.bobek.compass.R

enum class CardinalDirection(@StringRes val labelResourceId: Int) {
    NORTH(R.string.cardinal_direction_north),
    EASTNORTHEAST(R.string.cardinal_direction_eastnortheast),
    NORTHEAST(R.string.cardinal_direction_northeast),
    NORTHNORTHEAST(R.string.cardinal_direction_northnortheast),
    EAST(R.string.cardinal_direction_east),
    EASTSOUTHEAST(R.string.cardinal_direction_eastsoutheast),
    SOUTHEAST(R.string.cardinal_direction_southeast),
    SOUTHSOUTHEAST(R.string.cardinal_direction_southsoutheast),
    SOUTH(R.string.cardinal_direction_south),
    SOUTHSOUTHWEST(R.string.cardinal_direction_southsouthwest),
    SOUTHWEST(R.string.cardinal_direction_southwest),
    WESTSOUTHWEST(R.string.cardinal_direction_westsouthwest),
    WEST(R.string.cardinal_direction_west),
    NORTHWEST(R.string.cardinal_direction_northwest),
    NORTHNORTHWEST(R.string.cardinal_direction_northnorthwest),
    WESTNORTHWEST(R.string.cardinal_direction_westnorthwest)
}
