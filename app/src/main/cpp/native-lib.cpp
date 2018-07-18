#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring



JNICALL
Java_vanke_cer_a_game_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
