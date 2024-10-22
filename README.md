# flatbuffers-gwt  
A fork of flatbuffers-java with minor patches to allow compilation using GWT under LibGDX.  
Both the runtime and source code generated using flatc work.  

# Limitations
Can't use Utf8Old as it's whole point is to rely on a part of the stdlib that's not implemented by GWT/LibGDX.  
May *require* LibGDX as it implements several classes which are missing in GWT's stdlib implementation.  