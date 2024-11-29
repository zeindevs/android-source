#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_example_app_MainActivity_sayHello(JNIEnv *env, jobject /*this*/) {
  std::string hello = "Hello from C++";
  return env->NewStringUTF(hello.c_str());
}
