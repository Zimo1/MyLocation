package ru.yodata.mylocation

import android.graphics.Color

// Константы цветов:
const val ALERT_COLOR = Color.RED //0xFFCC0000 // Красный
const val PREPARE_COLOR = Color.BLUE //0xFFFFBB33 // Желтый
const val ALL_RIGHT_COLOR = Color.GREEN //0xFF669900 // Зеленый

class Settings {
    companion object {
        // Настройки locationManager.requestLocationUpdates - получение локаций от датчика GPS
        var locationMinTimeMs: Long = 2000 // Через какое время происходит обновление локации (мс)
        var locationMinDistanceM: Float = 2.0F // При сдвиге на какое расстояние (м)

        // Настройки карты
        var mapZoom = 17F // Масштаб изображения карты
        var mapTilt = 30F // Угол наклона карты к наблюдателю

    }
}