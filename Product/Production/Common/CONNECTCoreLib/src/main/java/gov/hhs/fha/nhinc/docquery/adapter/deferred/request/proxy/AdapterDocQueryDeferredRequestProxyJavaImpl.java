/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gov.hhs.fha.nhinc.docquery.adapter.deferred.request.proxy;

import gov.hhs.fha.nhinc.common.nhinccommon.AssertionType;
import gov.hhs.fha.nhinc.common.nhinccommon.NhinTargetCommunitiesType;
import gov.hhs.fha.nhinc.docquery.adapter.deferred.request.AdapterDocQueryDeferredRequestOrchImpl;
import gov.hhs.healthit.nhin.DocQueryAcknowledgementType;
import oasis.names.tc.ebxml_regrep.xsd.query._3.AdhocQueryRequest;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author JHOPPESC
 */
public class AdapterDocQueryDeferredRequestProxyJavaImpl implements AdapterDocQueryDeferredRequestProxy {
    private static Log log = LogFactory.getLog(AdapterDocQueryDeferredRequestProxyJavaImpl.class);

    public DocQueryAcknowledgementType respondingGatewayCrossGatewayQuery(AdhocQueryRequest msg, AssertionType assertion, NhinTargetCommunitiesType targets) {
        log.debug("Using Java Implementation for Adapter Doc Query Deferred Request Service");
        return new AdapterDocQueryDeferredRequestOrchImpl().respondingGatewayCrossGatewayQuery(msg, assertion);
    }

}
