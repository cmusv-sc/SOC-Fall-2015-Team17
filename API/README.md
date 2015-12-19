Overview:
---------
Currently we are providing APIs in 3 categores:

**Category 1: Manage Workflow**<br/>
   - [Get workflow by id](#1)<br/>
   - [Add a workflow](#2)<br/>
   - [Get all workflows](#3)<br/>
   - [Get top10 workflows](#4)<br/>

**Category 2: Manage Tag**<br/>
   - [Get tag by id](#5)<br/>
   - [Get all tags](#6)<br/>
   - [Get tags with weight](#7)<br/>

**Category 2: Manage Forums**<br/>
   - Please refer to other group: https://github.com/cmusv-sc/SOC-Fall-2015-Team18-Lead-Xin-Wan
   
Detailed Usages:
----------------

####Manage Workflow
1. <a name="1"></a>**GET WORKFLOW BY ID**
    - **Purpose**: Query a specific workflow using workflow's Id.
    - **Method**: GET
    - **URL**: /workflow/getWorkflow/id/:id
    - **Semantics**: 
        - **id**: Existing workflow's id.
    - **Sample Usages**:
      - **Sample request**: /workflow/1
          
      - **Sample result**: {"id":1,"title":"title","description":"Watson","contributor": "contributor", "image": "base64 code", "viewCount": 10 ...}
      
      - **Result**: HTTP 200 if successful, HTTP 404 if failed.
      
2. <a name="2"></a>**ADD A WORKFLOW**
    - **Purpose**: Add a new workflow to the system.
    - **Method**: POST
    - **URL**: /workflow/addWorkflow
    - **Semantics**:  As a POST method, the API cannot be directly executed through a web browser. Instead, it may be executed through Rails, JQuery, Python, BASH, etc.
      - **title** (string, not null): title
      - **description** (string, not null): description
      - **contributor** (string, not null): contributor
      - **image** (string, not null): image
      - **otherJsonNode** (string, not null): jsonNode
    - **Sample Usages**:
      - **Sample request**: {"id":1,"title":"title","description":"Watson","contributor": "contributor", "image": "base64 code", "viewCount": 10 ...}
          
      - **Sample result**: 1
               
      - **Result**: HTTP 201 if the new user has been successfully added to the database, with the ID of the newly created object in the response body, HTTP 400 if failed.
      
3. <a name="3"></a>**GET All WORKFLOWS**
    - **Purpose**: GET All WORKFLOWS
    - **Method**: GET
    - **URL**: /workflow/getAllWorkflows/json
    - **Sample Usages**:
      - **Sample request**: GET /workflow/workflows
      - **Sample result**: [{"id":1,"title":"title","description":"Watson","contributor": "contributor", "image": "base64 code", "viewCount": 10 ...},{"id":2,"title":"title","description":"Watson","contributor": "contributor", "image": "base64 code", "viewCount": 9 ...}...]
      - **Result**: HTTP 201 if the user has been successfully updated, HTTP 400 if the id is wrong
           
4. <a name="4"></a>**GET TOP 10 WORKFLOWS**
    - **Purpose**: GET All WORKFLOWS
    - **Method**: GET
    - **URL**: /workflow/getTop10WorkflowByViewCount/json
    - **Sample Usages**:
      - **Sample request**: GET /workflow/top10workflows
      - **Sample result**: [{"id":1,"title":"title","description":"Watson","contributor": "contributor", "image": "base64 code", "viewCount": 10 ...},{"id":2,"title":"title","description":"Watson","contributor": "contributor", "image": "base64 code", "viewCount": 9 ...}...]
      - **Result**: HTTP 201 if the user has been successfully updated, HTTP 400 if the id is wrong
  
####Manage Tag
5. <a name="5"></a>**GET TAG BY ID**
    - **Purpose**: Query a specific tag using tag's Id.
    - **Method**: GET
    - **URL**: /tag/getTag/id/:id/json
    - **Semantics**: 
        - **id**: Existing tag's id.
    - **Sample Usages**:
      - **Sample request**: /tag/1
          
      - **Sample result**: {"id":1, "name":"soc"}
      
      - **Result**: HTTP 200 if successful, HTTP 404 if failed.
      
6. <a name="6"></a>**GET All TAGS**
    - **Purpose**: GET All TAGS
    - **Method**: GET
    - **URL**: /tag/getAllTags/json
    - **Sample Usages**:
      - **Sample request**: GET /tag/tags
      - **Sample result**: [{"id":1, "name":"soc"}, {"id":2, "name":"computer"}...]
      - **Result**: HTTP 201 if the user has been successfully updated, HTTP 400 if the id is wrong
           
7. <a name="7"></a>**GET TAGS WITH WEIGHT**
    - **Purpose**: GET TAGS WITH WEIGHT FOR TAG CLOUD
    - **Method**: GET
    - **URL**: /tag/getAllTagWeights/json
    - **Sample Usages**:
      - **Sample request**: GET /workflow/top10workflows
      - **Sample result**: [{"id":1,"title":"title","description":"Watson","contributor": "contributor", "image": "base64 code", "viewCount": 10 ...},{"id":2,"title":"title","description":"Watson","contributor": "contributor", "image": "base64 code", "viewCount": 9 ...}...]
      - **Result**: HTTP 201 if the user has been successfully updated, HTTP 400 if the id is wrong