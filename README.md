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

Overview
============
Currently we are providing APIs as followed:
1. **GET WORKFLOW BY ID**
    - **Purpose**: Query a specific workflow using workflow's Id.
    - **Method**: GET
    - **URL**: /workflow/:id
    - **Semantics**: 
        - **id**: Existing workflow's id.
    - **Sample Usages**:
      - **Sample request**: /workflow/1
          
      - **Sample result**: {"id":1,"title":"title","description":"des","contributor": "con", "image": "image code", ...}
      
      - **Result**: HTTP 200 if successful, HTTP 404 if failed.

