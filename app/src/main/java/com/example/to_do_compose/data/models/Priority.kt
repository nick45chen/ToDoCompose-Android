package com.example.to_do_compose.data.models

import androidx.compose.ui.graphics.Color
import com.example.to_do_compose.ui.theme.Colors

enum class Priority(val color: Color) {
    HIGH(Colors.HighPriorityColor),
    MEDIUM(Colors.MediumPriorityColor),
    LOW(Colors.LowPriorityColor),
    NONE(Colors.NonePriorityColor),
}