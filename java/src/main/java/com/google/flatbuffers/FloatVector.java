/*
 * Copyright 2019 Google Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.flatbuffers;

import java.nio.ByteBuffer;

/**
 * Helper type for accessing vector of float values.
 */
public final class FloatVector extends BaseVector {
  /**
   * Assigns vector access object to vector data.
   *
   * @param _vector Start data of a vector.
   * @param _bb Table's ByteBuffer.
   * @return Returns current vector access object assigned to vector data whose offset is stored at
   *         `vector`.
   */
  public FloatVector __assign(int _vector, ByteBuffer _bb) {
    __reset(_vector, Constants.SIZEOF_FLOAT, _bb); return this;
  }

  /**
   * Reads the float value at the given index.
   *
   * @param j The index from which the float value will be read.
   * @return the float value at the given index.
   */
  public float get(int j) {
    return bb.getFloat(__element(j));
  }
}
