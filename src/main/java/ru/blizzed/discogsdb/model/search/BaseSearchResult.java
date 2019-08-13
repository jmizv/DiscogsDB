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

package ru.blizzed.discogsdb.model.search;

import com.google.gson.annotations.SerializedName;
import ru.blizzed.discogsdb.model.Type;

public class BaseSearchResult {

    @SerializedName("thumb")
    private String thumbnail;

    private String title;

    private String uri;

    @SerializedName("resource_url")
    private String resourceUrl;

    @SerializedName("id")
    private long id;

    private Type type;

    public String getThumbnail() {
        return thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public String getUri() {
        return uri;
    }

    public String getResourceUrl() {
        return resourceUrl;
    }

    public long getId() {
        return id;
    }

    public Type getType() {
        return type;
    }
}
