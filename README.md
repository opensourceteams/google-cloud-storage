# google cloud storage google 云存储


- https://console.cloud.google.com/storage/browser/thinktothings.com
- gs://thinktothings.com
- asia-east2 (香港)


###  [文件公开让所有人访问]
- ).选中文件
- ).修改权限
- ).新增权限 --> 用户 --> allUsers --> 读取者
- ).示例:https://storage.googleapis.com/thinktothings.com/xiaoshizi.wav



### [gsutil 工具]
- [gsutil 上传本地文件到 云存储]
```aidl
gsutil cp xiaoshizi.wav   gs://thinktothings.com/temp/
```


### [gsutil 从云存储下载文件到本地 ]
```aidl
gsutil cp gs://thinktothings.com/xiaoshizi.wav   ./
```



### [gsutil 从云存储查看文件夹列表 ]
```aidl
gsutil ls gs://thinktothings.com
```



### [gsutil 从云存储查看文件夹列表 ]
```aidl
gsutil ls -l gs://thinktothings.com
```



### [gsutil  公开文件权限 ]
```aidl
gsutil acl ch -u AllUsers:R gs://thinktothings.com/temp/xiaoshizi.wav
```

### [gsutil  移除文件权限 ] 不好使
```aidl
gsutil acl ch -d AllUsers gs://thinktothings.com/temp/xiaoshizi.wav
```



### [gsutil rm 删除对象]
```aidl
gsutil rm gs://thinktothings.com/temp/xiaoshizi2.wav
```


### [gsutil 查看存储分区信息]
```aidl
 gsutil du -s gs://thinktothings.com
```
