package org.meaningfulweb.api;

import org.meaningfulweb.opengraph.OGObject;
/*
Licensed to the Apache Software Foundation (ASF) under one
 or more contributor license agreements.  See the NOTICE file
 distributed with this work for additional information
 regarding copyright ownership.  The ASF licenses this file
 to you under the Apache License, Version 2.0 (the
 "License"); you may not use this file except in compliance
 with the License.  You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing,
 software distributed under the License is distributed on an
 "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 KIND, either express or implied.  See the License for the
 specific language governing permissions and limitations
 under the License.
*/

public class MeaningfulWebObject extends OGObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public String getDomain(){
	  return getMeta().get("domain");
	}
	
	public void setDomain(String domain){
	  getMeta().put("domain", domain);	
	}
	
	public String getDescription(){
	  return getMeta().get("description");
	}
		
	public void setDescription(String description){
	  getMeta().put("description", description);	
	}
	
	public String getText(){
	  return getMeta().get("text");
	}
	
	public String setText(String text){
	  return getMeta().put("text",text);
	}
}
