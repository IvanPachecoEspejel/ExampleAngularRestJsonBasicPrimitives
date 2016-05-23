package ivan.example.bean;

public class BasicPrimitivesItem {
    
    
    public BasicPrimitivesItem(Integer id, Integer parent, String title, String description, String image){
        this.id = id;
        this.parent = parent;
        this.title = title;
        this.description = description;
        this.image = image;
    }
    
    public BasicPrimitivesItem(){}
    
    /*
    Property: id
    Unique item id.
    */
    private Integer id = null;

    /*
    Property: parent
    Parent id. If parent is null then item placed as a root item.
    */
    private Integer parent = null;

    /*
    Property: title
    Default template title property.
    */
    private String title = null;

    /*
    Property: description
    Default template description element.
    */
    private String description = null;

    /*
    Property: image
    Url to image. This property is used in default template.
    */
    private String image = null;

    /*
    Property: context
    User context object.
    */
    private Object context = null;

    /*
    Property: itemTitleColor
    Default template title background color.
    */
    private String itemTitleColor = "#4169e1"/*primitives.common.Colors.RoyalBlue*/;

    /*
    Property: minimizedItemShapeType
        Defines minimized/dotted item shape type. By default it is set by ItemTemplate.minimizedItemShapeType property.
        Use this property to set marker type individually per item.

    See Also:
        <primitives.common.ShapeType>
    */
    private Object minimizedItemShapeType = null;

    /*
    Property: groupTitle
    Auxiliary group title property. Displayed vertically on the side of item.
    */
    private Object groupTitle = null;

    /*
    Property: groupTitleColor
    Group title background color.
    */
    private String groupTitleColor = "#4169e1"/*primitives.common.Colors.RoyalBlue*/;

    /*
    Property: isVisible
        If it is true then item is shown and selectable in hierarchy. 
        If item is hidden and it has visible children then only connector line is drawn instead of it.

    True - Item is shown.
    False - Item is hidden.

    Default:
        true
    */
    private Boolean isVisible = true;

    /*
    Property: isActive
        If it is true then item is selectable in hierarchy and it has mouse over highlight. 

    True - Item is clickable.
    False - Item is inactive and user cannot set cursor item or highlight.

    Default:
        true
    */
    private Boolean isActive = true;

    /*
    Property: hasSelectorCheckbox
        If it is true then selection check box is shown for the item. 
        Selected items are always shown in normal form, so if item is 
        selected then its selection check box is visible and checked.

    Auto - Depends on <primitives.orgdiagram.Config.hasSelectorCheckbox> setting.
    True - Selection check box is visible.
    False - No selection check box.

    Default:
    <primitives.common.Enabled.Auto>
    */
    private Integer hasSelectorCheckbox = 0/*primitives.common.Enabled.Auto*/;

    /*
    Property: hasButtons
        This option controls buttons panel visibility. 

    Auto - Depends on <primitives.orgdiagram.Config.hasButtons> setting.
    True - Has buttons panel.
    False - No buttons panel.

    Default:
    <primitives.common.Enabled.Auto>
    */
    private Integer hasButtons = 0/*primitives.common.Enabled.Auto*/;

    /*
        Property: itemType
            This property defines how item should be shown. 
            So far it is only possible to make it invisible.
    
        See Also:
            <primitives.orgdiagram.ItemType>
        
        Deafult:
            <primitives.orgdiagram.ItemType.Regular>
    */
    private Integer itemType = 0/*primitives.orgdiagram.ItemType.Regular*/;

    /*
        Property: adviserPlacementType
            In case of item types <primitives.orgdiagram.ItemType.Assistant> 
            and <primitives.orgdiagram.ItemType.Adviser> this option defines item 
            placement side relative to parent. By default items placed on 
            the right side of parent item.

        Deafult:
            <primitives.common.AdviserPlacementType.Auto>
    */
    private Integer adviserPlacementType = 0/*primitives.common.AdviserPlacementType.Auto*/;

    /*
    Property: childrenPlacementType
        Defines children placement form.
    */
    private Integer childrenPlacementType = 0/*primitives.common.ChildrenPlacementType.Auto*/;

    /*
    Property: templateName
        This is template name used to render this item.

        See Also:
        <primitives.orgdiagram.TemplateConfig>
        <primitives.orgdiagram.Config.templates> collection property.
    */
    private Object templateName = null;

    /*
    Property: showCallout
        This option controls items callout visibility.

    Auto - depends on <primitives.orgdiagram.Config.showCallout> option
    True - shown
    False - hidden

    Default:
        <primitives.common.Enabled.Auto>
    */
    private Integer showCallout = 0/*primitives.common.Enabled.Auto*/;

    /*
    Property: calloutTemplateName
        This is template name used to render callout for dotted item. 
        Actual callout template name is defined by following sequence:
        <primitives.orgdiagram.ItemConfig.calloutTemplateName> 
        <primitives.orgdiagram.ItemConfig.templateName>
        <primitives.orgdiagram.Config.defaultCalloutTemplateName>
        <primitives.orgdiagram.Config.defaultTemplateName>

    See Also:
        <primitives.orgdiagram.Config.templates> collection property.
    Default:
        null
    */
    private Object calloutTemplateName = null;

    /*
    Property: label
    Items label text.
    */
    private Object label = null;

    /*
    Property: showLabel
        This option controls items label visibility. Label is displayed in form of div having text inside, long string is wrapped inside of it. 
        User can control labels position relative to its item. Chart does not preserve space for label.

    Auto - depends on <primitives.orgdiagram.Config.labelOrientation> setting.
    True - always shown.
    False - hidden.

    See Also:
    <primitives.orgdiagram.ItemConfig.label>
    <primitives.orgdiagram.Config.labelSize>

    Default:
        <primitives.common.Enabled.Auto>
    */
    private Integer showLabel = 0/*primitives.common.Enabled.Auto*/;

    /*
    Property: labelSize
        Defines label size. It is needed to avoid labels overlapping. If one label overlaps another label or item it will be hidden. 
        Label string is wrapped when its length exceeds available width. 
        By default it is equal to charts <primitives.orgdiagram.Config.labelSize>.

    See Also:
        <primitives.common.Size>
    Default:
        null;
    */
    private Object labelSize = null;

    /*
    Property: labelOrientation
        Defines label orientation. 
        In default <primitives.text.TextOrientationType.Auto> mode it depends on chart <primitives.orgdiagram.Config.labelOrientation> setting.

    See Also:
    <primitives.orgdiagram.Config.labelOrientation>
    <primitives.text.TextOrientationType>

    Default:
        <primitives.text.TextOrientationType.Auto>
    */
    private Integer labelOrientation = 3/*primitives.text.TextOrientationType.Auto*/;

    /*
    Property: labelPlacement
        Defines label placement relative to the item. 
        In default <primitives.common.PlacementType.Auto> mode it depends on chart <primitives.orgdiagram.Config.labelPlacement> setting.

    See Also:
        <primitives.orgdiagram.Config.labelPlacement>
        <primitives.common.PlacementType>

    Default:
        <primitives.common.PlacementType.Auto>
    */
    private Integer labelPlacement = 0/*primitives.common.PlacementType.Auto*/;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the parent
     */
    public Integer getParent() {
        return parent;
    }

    /**
     * @param parent the parent to set
     */
    public void setParent(Integer parent) {
        this.parent = parent;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
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

    /**
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * @return the context
     */
    public Object getContext() {
        return context;
    }

    /**
     * @param context the context to set
     */
    public void setContext(Object context) {
        this.context = context;
    }

    /**
     * @return the itemTitleColor
     */
    public String getItemTitleColor() {
        return itemTitleColor;
    }

    /**
     * @param itemTitleColor the itemTitleColor to set
     */
    public void setItemTitleColor(String itemTitleColor) {
        this.itemTitleColor = itemTitleColor;
    }

    /**
     * @return the minimizedItemShapeType
     */
    public Object getMinimizedItemShapeType() {
        return minimizedItemShapeType;
    }

    /**
     * @param minimizedItemShapeType the minimizedItemShapeType to set
     */
    public void setMinimizedItemShapeType(Object minimizedItemShapeType) {
        this.minimizedItemShapeType = minimizedItemShapeType;
    }

    /**
     * @return the groupTitle
     */
    public Object getGroupTitle() {
        return groupTitle;
    }

    /**
     * @param groupTitle the groupTitle to set
     */
    public void setGroupTitle(Object groupTitle) {
        this.groupTitle = groupTitle;
    }

    /**
     * @return the groupTitleColor
     */
    public String getGroupTitleColor() {
        return groupTitleColor;
    }

    /**
     * @param groupTitleColor the groupTitleColor to set
     */
    public void setGroupTitleColor(String groupTitleColor) {
        this.groupTitleColor = groupTitleColor;
    }

    /**
     * @return the isVisible
     */
    public Boolean getIsVisible() {
        return isVisible;
    }

    /**
     * @param isVisible the isVisible to set
     */
    public void setIsVisible(Boolean isVisible) {
        this.isVisible = isVisible;
    }

    /**
     * @return the isActive
     */
    public Boolean getIsActive() {
        return isActive;
    }

    /**
     * @param isActive the isActive to set
     */
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    /**
     * @return the hasSelectorCheckbox
     */
    public Integer getHasSelectorCheckbox() {
        return hasSelectorCheckbox;
    }

    /**
     * @param hasSelectorCheckbox the hasSelectorCheckbox to set
     */
    public void setHasSelectorCheckbox(Integer hasSelectorCheckbox) {
        this.hasSelectorCheckbox = hasSelectorCheckbox;
    }

    /**
     * @return the hasButtons
     */
    public Integer getHasButtons() {
        return hasButtons;
    }

    /**
     * @param hasButtons the hasButtons to set
     */
    public void setHasButtons(Integer hasButtons) {
        this.hasButtons = hasButtons;
    }

    /**
     * @return the itemType
     */
    public Integer getItemType() {
        return itemType;
    }

    /**
     * @param itemType the itemType to set
     */
    public void setItemType(Integer itemType) {
        this.itemType = itemType;
    }

    /**
     * @return the adviserPlacementType
     */
    public Integer getAdviserPlacementType() {
        return adviserPlacementType;
    }

    /**
     * @param adviserPlacementType the adviserPlacementType to set
     */
    public void setAdviserPlacementType(Integer adviserPlacementType) {
        this.adviserPlacementType = adviserPlacementType;
    }

    /**
     * @return the childrenPlacementType
     */
    public Integer getChildrenPlacementType() {
        return childrenPlacementType;
    }

    /**
     * @param childrenPlacementType the childrenPlacementType to set
     */
    public void setChildrenPlacementType(Integer childrenPlacementType) {
        this.childrenPlacementType = childrenPlacementType;
    }

    /**
     * @return the templateName
     */
    public Object getTemplateName() {
        return templateName;
    }

    /**
     * @param templateName the templateName to set
     */
    public void setTemplateName(Object templateName) {
        this.templateName = templateName;
    }

    /**
     * @return the showCallout
     */
    public Integer getShowCallout() {
        return showCallout;
    }

    /**
     * @param showCallout the showCallout to set
     */
    public void setShowCallout(Integer showCallout) {
        this.showCallout = showCallout;
    }

    /**
     * @return the calloutTemplateName
     */
    public Object getCalloutTemplateName() {
        return calloutTemplateName;
    }

    /**
     * @param calloutTemplateName the calloutTemplateName to set
     */
    public void setCalloutTemplateName(Object calloutTemplateName) {
        this.calloutTemplateName = calloutTemplateName;
    }

    /**
     * @return the label
     */
    public Object getLabel() {
        return label;
    }

    /**
     * @param label the label to set
     */
    public void setLabel(Object label) {
        this.label = label;
    }

    /**
     * @return the showLabel
     */
    public Integer getShowLabel() {
        return showLabel;
    }

    /**
     * @param showLabel the showLabel to set
     */
    public void setShowLabel(Integer showLabel) {
        this.showLabel = showLabel;
    }

    /**
     * @return the labelSize
     */
    public Object getLabelSize() {
        return labelSize;
    }

    /**
     * @param labelSize the labelSize to set
     */
    public void setLabelSize(Object labelSize) {
        this.labelSize = labelSize;
    }

    /**
     * @return the labelOrientation
     */
    public Integer getLabelOrientation() {
        return labelOrientation;
    }

    /**
     * @param labelOrientation the labelOrientation to set
     */
    public void setLabelOrientation(Integer labelOrientation) {
        this.labelOrientation = labelOrientation;
    }

    /**
     * @return the labelPlacement
     */
    public Integer getLabelPlacement() {
        return labelPlacement;
    }

    /**
     * @param labelPlacement the labelPlacement to set
     */
    public void setLabelPlacement(Integer labelPlacement) {
        this.labelPlacement = labelPlacement;
    }
}
