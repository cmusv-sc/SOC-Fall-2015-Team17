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

