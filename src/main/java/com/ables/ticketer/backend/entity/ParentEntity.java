package com.ables.ticketer.backend.entity;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class ParentEntity {
	@Id
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	public boolean isPersisted() {
		return id != null;
	}
	
	@Override
	public int hashCode() {
		if(getId() != null) {
			return getId().hashCode();
		}
		
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if(getClass() != obj.getClass())
			return false;
		
		ParentEntity entity = (ParentEntity) obj;
		if(getId() == null || entity.getId() == null)
			return false;
		return getId().equals(entity.getId());
	}
	
	
}
