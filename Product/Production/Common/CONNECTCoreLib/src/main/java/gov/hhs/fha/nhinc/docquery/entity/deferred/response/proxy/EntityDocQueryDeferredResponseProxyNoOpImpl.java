/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gov.hhs.fha.nhinc.docquery.entity.deferred.response.proxy;

import gov.hhs.fha.nhinc.common.nhinccommon.AssertionType;
import gov.hhs.fha.nhinc.common.nhinccommon.NhinTargetCommunitiesType;
import gov.hhs.fha.nhinc.nhinclib.NhincConstants;
import gov.hhs.healthit.nhin.DocQueryAcknowledgementType;
import oasis.names.tc.ebxml_regrep.xsd.query._3.AdhocQueryResponse;
import oasis.names.tc.ebxml_regrep.xsd.rs._3.RegistryResponseType;

/**
 *
 * @author jhoppesc
 */
public class EntityDocQueryDeferredResponseProxyNoOpImpl implements EntityDocQueryDeferredResponseProxy {

    public DocQueryAcknowledgementType respondingGatewayCrossGatewayQuery(AdhocQueryResponse msg, AssertionType assertion, NhinTargetCommunitiesType targets) {
        DocQueryAcknowledgementType ack = new DocQueryAcknowledgementType();
        RegistryResponseType regResp = new RegistryResponseType();
        regResp.setStatus(NhincConstants.DOC_QUERY_DEFERRED_RESP_ACK_STATUS_MSG);
        ack.setMessage(regResp);

        return ack;
    }

}
