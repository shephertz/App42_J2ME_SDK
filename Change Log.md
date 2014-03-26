* [Release Version 2.1](https://github.com/shephertz/App42_J2ME_SDK/blob/master/Change%20Log.md#version-21)
* [Release Version 2.0](https://github.com/shephertz/App42_J2ME_SDK/blob/master/Change%20Log.md#version-20)
* [Release Version 1.9](https://github.com/shephertz/App42_J2ME_SDK/blob/master/Change%20Log.md#version-19)
* [Release Version 1.8](https://github.com/shephertz/App42_J2ME_SDK/blob/master/Change%20Log.md#version-18)

## Version 2.1
 

**Release Date:** 26-03-2014

**Release Version:** 2.1

**The following features have been pushed  :**

```
If you are upgrading from previous version of App42_J2ME_SDK_2.0 and have used setQuery method on any service, you have to set App42API.setDbName instead of passing it in method parameter.

**OlD Code Snippet:
setQuery("dbName","collectionName","query");

**New Code Snippet :
App42API.setDbName("dbName");
setQuery("collectionName","query");
```

**The following features have been pushed to the services :**


**STORAGE SERVICE**

```
addOrUpdateKeys
addAttachmentToDocs
insertJSONDocument(With Attach File)
```

**User SERVICE**

```
addJSONObject(Add Extra Information while creating user)
```

**SCOREBOARD SERVICE**

```
addJSONObject(Add Extra Information of user while saves score)
```

**REVIEW SERVICE**

```
getAllReviewsByUser
```

**This release contains the following bug fix:**

```
None
```


## Version 2.0
 

**Release Date:** 07-02-2014

**Release Version:** 2.0

**The following features have been pushed  :**

```
Meta info in UserService (getUser,getUsersByRole,getUserByEmailId) and ScoreBoardService(getTopNRankers).
```

**The following features have been pushed to the services :**

**STORAGE SERVICE**

```
updateDocumentByQuery
```

**REVIEW SERVICE**
```
deleteReviewByReviewId
deleteCommentByCommentId
```

**BUDDY SERVICE**
```
unFriend
deleteMessageById
deleteMessageByIds
```

**SCOREBOARD SERVICE**
```
getTopNTargetRankers
getTopNRankersFromFacebook(With specefied dange range)
```

**GALLERY SERVICE**
```
updatePhoto
```

**This release contains the following bug fix:**
```
None.
```

## Version 1.9

**Release Date:** 25-11-2013

**Release Version:** 1.9

**The following features have been pushed  :**

```
Set logged in user
```


**STORAGE SERVICE**

```
saveOrUpdateDocumentByKeyValue
```

**This release contains the following bug fix:**

```
None
```

## Version 1.8

**Release Date:** 23-10-2013

**Release Version:** 1.8

**The following Services have been pushed to the latest :**

```
AB Test Service
```

**This release contains the following bug fix:**

```
None
```
