Apache CMDA Workflow Scientific Social Network
================

The Climate Model Diagnostic Analyzer (CMDA) provides web services for multi-aspect physics-based and phenomenon-oriented climate model performance evaluation and diagnosis through the comprehensive and synergistic use of multiple observational data, reanalysis data, and model outputs.

In this project, we aim at building a social platform for scientists to upload scientific workflows and share with the community. The web service will allow scientists to create an account and upload new workflows, browse through the catalog of available workflows, comment on other workflows, tag them for clustering , upvote useful workflows. In short, this will be a social network for scientific experiments. 

We believe this project will be of great help to the Research Community.

Requirements
============
Java 1.7+ (http://www.oracle.com/technetwork/java/javase/downloads)

Play 2.2.x (http://www.playframework.com/download)


Installation
============
1. make a new directory from terminal: mkdir test
2. Download: git clone https://github.com/cmusv-sc/SOC-Fall-2015-Team17-Lead-Runyu-Shi/tree/master/ApacheCMDA-Frontend 
3. Use IntelliJ IDEA to import either frontend or backend by using SBT tools
4. mac users could run as followed in the terminal:
For backend: ./activator "run 9034";
For frontend: ./activator -Dhttp.netty.maxInitialLineLength=81920000 run
Open Chrome: open /Applications/Google\ Chrome.app --args --disable-web-security
5. type http://localhost:9000 in your browser

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

**Category 3: Manage Forums**<br/>
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