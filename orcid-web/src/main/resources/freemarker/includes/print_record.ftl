<#--

    =============================================================================

    ORCID (R) Open Source
    http://orcid.org

    Copyright (c) 2012-2014 ORCID, Inc.
    Licensed under an MIT-Style License (MIT)
    http://orcid.org/open-source-license

    This copyright and license information (including a link to the full license)
    shall be included in its entirety in all copies or substantial portion of
    the software.

    =============================================================================

-->

	<div class="print-orcid-record" ng-controller="PrintRecordCtrl">
        <@orcid.checkFeatureStatus featureName='HTTPS_IDS'>
            <#if ((isPublicProfile)?? && isPublicProfile == true | (locked)?? && locked | (deprecated)?? && deprecated)>
                <a id="printRecord" ng-click="printRecord('${baseUri}/${(effectiveUserOrcid)!}/print')">
                <span class="glyphicon glyphicon-print"></span> ${springMacroRequestContext.getMessage("public_record.printView")}</a>
                <div class="popover-help-container">
                    <a href="javascript:void(0);"><i class="glyphicon glyphicon-question-sign"></i></a>
                    <div id="print-help" class="popover bottom">
                        <div class="arrow"></div>
                        <div class="popover-content">
                            <p>${springMacroRequestContext.getMessage("public_record.printHelpText")}</p>
                        </div>
                    </div>
                </div>  
            <#else>
                <a id="printRecord" ng-click="printRecord('${baseUri}/${(effectiveUserOrcid)!}/print')">
                <span class="glyphicon glyphicon-print"></span> ${springMacroRequestContext.getMessage("workspace.printView")}</a>
                <div class="popover-help-container">
                    <a href="javascript:void(0);"><i class="glyphicon glyphicon-question-sign"></i></a>
                    <div id="print-help" class="popover bottom">
                        <div class="arrow"></div>
                        <div class="popover-content">
                            <p>${springMacroRequestContext.getMessage("workspace.printHelpText")}</p>
                        </div>
                    </div>
                </div>  
            </#if>
        </@orcid.checkFeatureStatus>
        <@orcid.checkFeatureStatus featureName='HTTPS_IDS' enabled=false>
            <#if ((isPublicProfile)?? && isPublicProfile == true | (locked)?? && locked | (deprecated)?? && deprecated)>
                <a id="printRecord" ng-click="printRecord('${baseUriHttp}/${(effectiveUserOrcid)!}/print')">
                <span class="glyphicon glyphicon-print"></span> ${springMacroRequestContext.getMessage("public_record.printView")}</a>
                <div class="popover-help-container">
                    <a href="javascript:void(0);"><i class="glyphicon glyphicon-question-sign"></i></a>
                    <div id="print-help" class="popover bottom">
                        <div class="arrow"></div>
                        <div class="popover-content">
                            <p>${springMacroRequestContext.getMessage("public_record.printHelpText")}</p>
                        </div>
                    </div>
                </div>  
            <#else>
                <a id="printRecord" ng-click="printRecord('${baseUri}/${(effectiveUserOrcid)!}/print')">
                <span class="glyphicon glyphicon-print"></span> ${springMacroRequestContext.getMessage("workspace.printView")}</a>
                <div class="popover-help-container">
                    <a href="javascript:void(0);"><i class="glyphicon glyphicon-question-sign"></i></a>
                    <div id="print-help" class="popover bottom">
                        <div class="arrow"></div>
                        <div class="popover-content">
                            <p>${springMacroRequestContext.getMessage("workspace.printHelpText")}</p>
                        </div>
                    </div>
                </div>  
            </#if>
        </@orcid.checkFeatureStatus>	
    </div>

