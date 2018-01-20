package com.github.zenonwch.germes.app.model.entity.base;


import com.github.zenonwch.germes.app.model.entity.person.Account;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Base class for all business entities
 *
 * @author admin
 */
@SuppressWarnings("ClassReferencesSubclass")
public abstract class AbstractEntity {
    /**
     * Unique entity identifier
     */
    private int id;

    /**
     * Entity creation timestamp
     */
    private LocalDateTime createdAt;

    /**
     * Entity last modification timestamp
     */
    private LocalDateTime modifiedAt;

    /**
     * Entity creator
     */
    private Account createdBy;

    /**
     * Entity modifier
     */
    private Account modifiedBy;

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(final LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(final LocalDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public Account getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(final Account createdBy) {
        this.createdBy = createdBy;
    }

    public Account getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(final Account modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractEntity)) return false;
        final AbstractEntity that = (AbstractEntity) o;
        return getId() == that.getId() &&
                Objects.equals(getCreatedAt(), that.getCreatedAt()) &&
                Objects.equals(getCreatedBy(), that.getCreatedBy());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCreatedAt(), getCreatedBy());
    }
}
