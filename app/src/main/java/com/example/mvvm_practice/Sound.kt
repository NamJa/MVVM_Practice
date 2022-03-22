package com.example.mvvm_practice

private const val WAV = ".wav"

class Sound (val assetPath: String) {
    // "/"으로 분리한 문자열중에 맨 끝에 있는 파일 이름을 얻고, removeSuffix(String)을 사용해서 확장자를 제거한다.
    val name = assetPath.split("/").last().removeSuffix(WAV)
}