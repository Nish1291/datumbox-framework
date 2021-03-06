/**
 * Copyright (C) 2013-2017 Vasilis Vryniotis <bbriniotis@datumbox.com>
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
package com.datumbox.framework.core.common.interfaces;

import java.util.Map;

/**
 * This interface is used to mark classes that work as extractors. 
 * 
 * @author Vasilis Vryniotis <bbriniotis@datumbox.com>
 * @param <K>
 * @param <V>
 * @param <I>
 */
public interface Extractable<K, V, I> {
    
    /**
     * The extract method gets an input, performs extraction and returns the output 
     * in a map.
     * 
     * @param input
     * @return 
     */
    public Map<K, V> extract(final I input);
    
}
