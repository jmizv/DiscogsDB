
/*
 * Copyright (c) 2017 BlizzedRu (Ivan Vlasov)
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

package ru.blizzed.discogsdb.model.release;

import com.google.gson.annotations.SerializedName;

public class Label {

    @SerializedName("catno")
    private String catNo;

    @SerializedName("entity_type")
    private String entityType;

    @SerializedName("id")
    private long id;

    @SerializedName("name")
    private String name;

    @SerializedName("resource_url")
    private String resourceUrl;

    public String getCatNo() {
        return catNo;
    }

    public String getEntityType() {
        return entityType;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getResourceUrl() {
        return resourceUrl;
    }
}
