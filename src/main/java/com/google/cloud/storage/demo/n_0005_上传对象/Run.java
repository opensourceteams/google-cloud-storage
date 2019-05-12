package com.google.cloud.storage.demo.n_0005_上传对象;

// Imports the Google Cloud client library

import com.google.api.gax.paging.Page;
import com.google.cloud.storage.*;

public class Run {
    public static void main(String... args) throws Exception {
        // Instantiates a client
        Storage storage = StorageOptions.getDefaultInstance().getService();



        BlobId blobId = BlobId.of("thinktothings.com", "a");
        BlobInfo blobInfo = BlobInfo.newBuilder(blobId).setContentType("text/plain").build();
        Blob blob = storage.create(blobInfo, "Hello, Cloud Storage!".getBytes("UTF-8"));



    }
}