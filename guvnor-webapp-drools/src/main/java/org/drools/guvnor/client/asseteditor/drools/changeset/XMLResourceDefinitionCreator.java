/*
 * Copyright 2011 JBoss by Red Hat.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.drools.guvnor.client.asseteditor.drools.changeset;

/**
 * Defines the interface of XMLReourceDefinitionCreator like: <resource
 * type="DRL" name="someName" description="some Descr" source="..."/>
 */
public interface XMLResourceDefinitionCreator {

    public String resourceXMLElementTemplate = "<resource {name} {description} source='{source}' type='{type}' />";

    /**
     * Return an xml <resource> element.
     * 
     * @return an xml <resource> element
     */
    void getResourceElement(ResourceElementReadyCommand resourceElementReadyCommand);

}
