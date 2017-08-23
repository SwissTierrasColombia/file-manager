package org.ut.response;

import org.ut.entity.VersionInfo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class APIVersionsResponse implements Serializable {

    private List<VersionInfo> versions;

    public APIVersionsResponse() {
        this.versions = new ArrayList<>();
    }

    public List<VersionInfo> getVersions() {
        return versions;
    }

    public void setVersions(List<VersionInfo> versions) {
        this.versions = versions;
    }

    public void addVersion(String name, String url) {
        this.versions.add(new VersionInfo(name, url));
    }

}