/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shenyu.plugin.sign.api;

import org.apache.shenyu.common.utils.SignUtils;

import java.util.Map;

/**
 * The Sign plugin default signer.
 */
public class DefaultSignProvider implements SignProvider {

    /**
     * acquired sign.
     *
     * @param signKey sign key
     * @param jsonParams json params
     * @param queryParams  url query params
     * @return sign
     */
    @Override
    public String generateSign(final String signKey, final Map<String, String> jsonParams, final Map<String, String> queryParams) {
        return SignUtils.generateSign(signKey, jsonParams, queryParams);
    }
}
