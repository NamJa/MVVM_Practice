package com.example.mvvm_practice

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class SoundViewModel : BaseObservable() {
    var sound: Sound? = null
        set(sound) {
            field = sound
            notifyChange()
        }

    // SoundViewModel의 RecyclerView에서 바인딩되는 속성에 에노테이션 지정
    @get:Bindable
    val title: String?
        get() = sound?.name
}