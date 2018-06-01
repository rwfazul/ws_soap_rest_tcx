/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 * @author isabella
 */

@XmlAccessorType(XmlAccessType.FIELD)
class TrackPoint {
    
    @XmlAttribute(name = "Time")
    Date time;
    
    @XmlAttribute(name = "AltitudeMeters")
    Double altitudeMeters;
    
    @XmlAttribute(name = "DistanceMeters")
    Double distanceMeters;
    
    @XmlAttribute(name = "Cadence")
    Integer cadence;
    
    @XmlAttribute(name = "SensorState")
    String sensorState;
    
    @XmlAttribute(name = "Position")
    Position position;
    
}
