# gdx-flatbuffers 
A fork of [flatbuffers-java](https://github.com/google/flatbuffers/tree/master/java) with minor patches to allow compilation using GWT under LibGDX.  
Both the runtime and source code generated using flatc work.  

# Patches
- Ignore Utf8Old.java in GWT module  
- Replace usages of String.format with operators (Utf8Safe.java)  
- Replace usages of floatToRawIntBits and doubleToRawLongBits (ArrayReadWriteBuf.java)  

# Gradle dependency  
Make sure the `mavenCentral()` repository is enabled.  
Specify `$fbsversion` in gradle.properties like so.  
```
fbsVersion=24.3.25
```
## Desktop/Android/IOS  
In core/build.gradle  
```
api "io.github.solirs:gdx-flatbuffers:$fbsVersion"
```

## GWT (HTML)  
In html/build.gradle  
```  
  implementation "io.github.solirs:gdx-flatbuffers:$fbsVersion"  
  implementation "io.github.solirs:gdx-flatbuffers:$fbsVersion:sources"  
```  
In GdxDefinition.gwt.xml  
```
<inherits name="com.google.flatbuffers.flatbuffers-gwt" />
```

# Usage  
Exactly the same as google's flatbuffers-java. Even the imports are the same so as to not break flatc-generated files.  
A tutorial on flatbuffers usage in java is available [here](https://flatbuffers.dev/flatbuffers_guide_tutorial.html) (don't forget to choose java as the language).  

# Limitations
Can't use Utf8Old as its whole point is to rely on a part of the stdlib that's not implemented by GWT/LibGDX.  
May *require* LibGDX as it implements several classes which are missing in GWT's stdlib implementation.  
