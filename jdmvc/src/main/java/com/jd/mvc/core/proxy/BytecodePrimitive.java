package com.jd.mvc.core.proxy;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class BytecodePrimitive {
	static final BytecodePrimitive BOOLEAN = new BytecodePrimitive("boolean", "Z", Boolean.class, Boolean.TYPE, "booleanValue");

	static final BytecodePrimitive CHAR = new BytecodePrimitive("char", "C", Character.class, Character.TYPE, "charValue");

	static final BytecodePrimitive BYTE = new BytecodePrimitive("byte", "B", Byte.class, Byte.TYPE, "byteValue");

	static final BytecodePrimitive SHORT = new BytecodePrimitive("short", "S", Short.class, Short.TYPE, "shortValue");

	static final BytecodePrimitive INT = new BytecodePrimitive("int", "I", Integer.class, Integer.TYPE, "intValue");

	static final BytecodePrimitive LONG = new BytecodePrimitive("long", "J", Long.class, Long.TYPE, "longValue");

	static final BytecodePrimitive FLOAT = new BytecodePrimitive("float", "F", Float.class, Float.TYPE, "floatValue");

	static final BytecodePrimitive DOUBLE = new BytecodePrimitive("double", "D", Double.class, Double.TYPE, "doubleValue");

	static final BytecodePrimitive VOID = new BytecodePrimitive("void", "V", Void.class, Void.TYPE, null);

	static final Map<String, BytecodePrimitive> primitives;
	static {
		Map<String, BytecodePrimitive> map = new HashMap<String, BytecodePrimitive>();
		map.put(BOOLEAN.getName(), BOOLEAN);
		map.put(BOOLEAN.getArrayComponentName(), BOOLEAN);
		map.put(CHAR.getName(), CHAR);
		map.put(CHAR.getArrayComponentName(), CHAR);
		map.put(BYTE.getName(), BYTE);
		map.put(BYTE.getArrayComponentName(), BYTE);
		map.put(SHORT.getName(), SHORT);
		map.put(SHORT.getArrayComponentName(), SHORT);
		map.put(INT.getName(), INT);
		map.put(INT.getArrayComponentName(), INT);
		map.put(LONG.getName(), LONG);
		map.put(LONG.getArrayComponentName(), LONG);
		map.put(FLOAT.getName(), FLOAT);
		map.put(FLOAT.getArrayComponentName(), FLOAT);
		map.put(DOUBLE.getName(), DOUBLE);
		map.put(DOUBLE.getArrayComponentName(), DOUBLE);
		map.put(VOID.getName(), VOID);
		map.put(VOID.getArrayComponentName(), VOID);
		primitives = Collections.unmodifiableMap(map);
	}

	private final String name;

	private final Class<?> wrapperClass;

	private final Class<?> primitiveClass;

	private final String arrayComponentName;

	private final String wrapperClassName;

	private final String valueMethodName;

	private BytecodePrimitive(String name, String arrayComponentName, Class<?> wrapperClass, Class<?> primitiveClass, String valueMethodName) {
		this.name = name;
		this.arrayComponentName = arrayComponentName;
		this.wrapperClass = wrapperClass;
		this.primitiveClass = primitiveClass;
		this.wrapperClassName = wrapperClass.getName();
		this.valueMethodName = valueMethodName;
	}

	static BytecodePrimitive valueOf(String name) {
		return primitives.get(name);
	}

	String getName() {
		return name;
	}

	String getArrayComponentName() {
		return arrayComponentName;
	}

	String getWrapperClassName() {
		return wrapperClassName;
	}

	String getValueMethodName() {
		return valueMethodName;
	}

	Class<?> getWrapperClass() {
		return wrapperClass;
	}

	Class<?> getPrimitiveClass() {
		return primitiveClass;
	}
}