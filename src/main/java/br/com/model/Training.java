/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 * @author isabella
 */
@XmlAccessorType(XmlAccessType.FIELD)
class Training {
    
    @XmlAttribute(name = "VirtualPartner")
    Boolean virtualPartner;
    
    @XmlAttribute(name = "Plan")
    Plan plan;
    
    @XmlAttribute(name = "Creator")
    Creator creator;
    
}
