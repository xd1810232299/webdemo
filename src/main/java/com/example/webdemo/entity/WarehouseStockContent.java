package com.example.webdemo.entity;

import org.dom4j.tree.AbstractEntity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 仓库存储信息明细（库存表）
 * 
 * @author Administrator
 *
 */
@Entity
@Table(name = "t_warehouse_storage_content")
public class WarehouseStockContent extends AbstractEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -350732810163222029L;

	/**
	 * 物料
	 */
	@Id
	private String pn;

	/**
	 * 物料名称
	 */
	private String name;

	/**
	 * 规格
	 */
	private String standard;

	/**
	 * 库存数量
	 */
	private Long stockCount=0L;

	/**
	 * 可用数量
	 */
	private Long usableCount=0L;

	/**
	 * 架式仓数量
	 */
	private Long rackCount=0L;

	/**
	 * 冻结数量
	 */
	private Long freezesCount=0L;
	
	/**
	 * 隔离数量
	 */
	private Long isolationCount=0L;

	/**
	 * 来料数量
	 */
	private Long rechargeCount=0L;
    /**
     * 边仓数量
     */
    private Long edgeCount=0L;

    /**
     * 智能料
     */
    private Long aiCount=0L;

    /**
     * 灯带区
     */
    private Long lampBeltCount=0L;
	/**
	 * 仓库ID
	 */
	private Long warehouse;

	/**
	 * 物料单位key
	 */
	private String unitKey;

	/**
	 * 物料单位value
	 */
	private String unitValue;

	/**
	 * 
	 */
	private String byname;

	@Basic
	@Column(name = "warehouse_id")
	public Long getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(Long warehouse) {
		this.warehouse = warehouse;
	}

	public WarehouseStockContent() {

	}

	public WarehouseStockContent(String pn, String name, Long warehouse) {
		this.setPn(pn);
		this.setName(name);
		this.setWarehouse(warehouse);
		this.setFreezesCount(0L);
		this.setStockCount(0L);
		this.setUsableCount(0L);
		this.setIsolationCount(0L);
		this.setRackCount(0l);
	}

	public WarehouseStockContent(String pn, String name, Long warehouse, String unitKey, String unitValue) {
		this.setPn(pn);
		this.setName(name);
		this.setWarehouse(warehouse);
		this.setFreezesCount(0L);
		this.setStockCount(0L);
		this.setUsableCount(0L);
		this.setIsolationCount(0L);
		this.setRackCount(0l);
		this.setUnitKey(unitKey);
		this.setUnitValue(unitValue);
	}
	
	@Basic
	@Column(name = "pn")
	public String getPn() {
		return pn;
	}

	public void setPn(String pn) {
		this.pn = pn;
	}

	@Basic
	@Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	@Column(name = "standard")
	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	@Basic
	@Column(name = "stock_count")
	public Long getStockCount() {
		return stockCount;
	}

	public void setStockCount(Long stockCount) {
		this.stockCount = stockCount;
	}

	@Basic
	@Column(name = "usable_count")
	public Long getUsableCount() {
		return usableCount;
	}

	public void setUsableCount(Long usableCount) {
		this.usableCount = usableCount;
	}

	@Basic
	@Column(name = "freezes_count")
	public Long getFreezesCount() {
		return freezesCount;
	}

	public void setFreezesCount(Long freezesCount) {
		this.freezesCount = freezesCount;
	}

	public String getUnitKey() {
		return unitKey;
	}

	public void setUnitKey(String unitKey) {
		this.unitKey = unitKey;
	}

	public String getUnitValue() {
		return unitValue;
	}

	public void setUnitValue(String unitValue) {
		this.unitValue = unitValue;
	}

	public String getByname() {
		return byname;
	}

	public void setByname(String byname) {
		this.byname = byname;
	}

	public Long getIsolationCount() {
		return isolationCount;
	}

	public void setIsolationCount(Long isolationCount) {
		this.isolationCount = isolationCount;
	}

	public Long getRechargeCount() {
		return rechargeCount;
	}

	public void setRechargeCount(Long rechargeCount) {
		this.rechargeCount = rechargeCount;
	}

    public Long getEdgeCount() {
        return edgeCount;
    }

    public void setEdgeCount(Long edgeCount) {
        this.edgeCount = edgeCount;
    }

    public Long getAiCount() {
        return aiCount;
    }

    public void setAiCount(Long aiCount) {
        this.aiCount = aiCount;
    }

	@Basic
	@Column(name = "rack_count")
	public Long getRackCount() {
		return rackCount;
	}

	public void setRackCount(Long rackCount) {
		this.rackCount = rackCount;
	}

    public Long getLampBeltCount() {
        return lampBeltCount;
    }

    public void setLampBeltCount(Long lampBeltCount) {
        this.lampBeltCount = lampBeltCount;
    }
}
