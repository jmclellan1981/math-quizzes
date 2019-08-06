package com.mathquiz.viewmodels;

public class LookupDataViewModel extends BaseViewModel {
    private static final long serialVersionUID = 3920519003223441654L;
    private LookupTypeViewModel lookupType;
    private String name;
    private String description;

    /**
     * @return the lookupType
     */
    public LookupTypeViewModel getLookupType() {
        return lookupType;
    }

    /**
     * @param lookupType the lookupType to set
     */
    public void setLookupType(LookupTypeViewModel lookupType) {
        this.lookupType = lookupType;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
}
