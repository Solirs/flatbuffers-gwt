# flatbuffers-gwt  
A fork of [flatbuffers-java](https://github.com/google/flatbuffers/tree/master/java) with minor patches to allow compilation using GWT under LibGDX.  
Both the runtime and source code generated using flatc work.  

# Patches
- Ignore Utf8Old.java in GWT module  
- Replace usages of String.format with operators (Utf8Safe.java)  
- Replace usages of floatToRawIntBits and doubleToRawLongBits (ArrayReadWriteBuf.java)  

# Limitations
Can't use Utf8Old as its whole point is to rely on a part of the stdlib that's not implemented by GWT/LibGDX.  
May *require* LibGDX as it implements several classes which are missing in GWT's stdlib implementation.  