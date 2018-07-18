package com.precious.journal.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "diary")
public class DiaryEntry {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String title;
    private String description;
    @ColumnInfo(name = "updated_at")
    private Date upDatedAt;

    @Ignore
    public DiaryEntry(String title, String description, Date upDatedAt) {
        this.title = title;
        this.description = description;
        this.upDatedAt = upDatedAt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getUpDatedAt() {
        return upDatedAt;
    }

    public void setUpDatedAt(Date upDatedAt) {
        this.upDatedAt = upDatedAt;
    }
}
