package medrex.client.mds3.general.itemsets;

import medrex.client.mds3.general.Mds3ItemSet;
import medrex.client.mds3.general.Mds3Page;
import medrex.client.mds3.ui.commons.Mds3Footer;
import medrex.client.mds3.ui.commons.Mds3Header;
import medrex.client.mds3.ui.subSections.sectionA.PanelA0100;
import medrex.client.mds3.ui.subSections.sectionA.PanelA0200;
import medrex.client.mds3.ui.subSections.sectionA.PanelA0310A;
import medrex.client.mds3.ui.subSections.sectionA.PanelA0310B;
import medrex.client.mds3.ui.subSections.sectionA.PanelA0310C;
import medrex.client.mds3.ui.subSections.sectionA.PanelA0310D;
import medrex.client.mds3.ui.subSections.sectionA.PanelA0310E;
import medrex.client.mds3.ui.subSections.sectionA.PanelA0310F;
import medrex.client.mds3.ui.subSections.sectionA.PanelA0410;
import medrex.client.mds3.ui.subSections.sectionA.PanelA0500;
import medrex.client.mds3.ui.subSections.sectionA.PanelA0600;
import medrex.client.mds3.ui.subSections.sectionA.PanelA0700;
import medrex.client.mds3.ui.subSections.sectionA.PanelA0800;
import medrex.client.mds3.ui.subSections.sectionA.PanelA0900;
import medrex.client.mds3.ui.subSections.sectionA.PanelA1000;
import medrex.client.mds3.ui.subSections.sectionA.PanelA1100;
import medrex.client.mds3.ui.subSections.sectionA.PanelA1200;
import medrex.client.mds3.ui.subSections.sectionA.PanelA1300;
import medrex.client.mds3.ui.subSections.sectionA.PanelA1500;
import medrex.client.mds3.ui.subSections.sectionA.PanelA1550;
import medrex.client.mds3.ui.subSections.sectionA.PanelA1600;
import medrex.client.mds3.ui.subSections.sectionA.PanelA1700;
import medrex.client.mds3.ui.subSections.sectionA.PanelA1800;
import medrex.client.mds3.ui.subSections.sectionA.PanelA2000;
import medrex.client.mds3.ui.subSections.sectionA.PanelA2100;
import medrex.client.mds3.ui.subSections.sectionA.PanelA2200;
import medrex.client.mds3.ui.subSections.sectionA.PanelA2300;
import medrex.client.mds3.ui.subSections.sectionA.PanelA2400;
import medrex.client.mds3.ui.subSections.sectionA.PanelAHeader;
import medrex.client.mds3.ui.subSections.sectionA.PanelHeader;
import medrex.client.mds3.ui.subSections.sectionB.PanelB0100;
import medrex.client.mds3.ui.subSections.sectionB.PanelB0200;
import medrex.client.mds3.ui.subSections.sectionB.PanelB0300;
import medrex.client.mds3.ui.subSections.sectionB.PanelB0600;
import medrex.client.mds3.ui.subSections.sectionB.PanelB0700;
import medrex.client.mds3.ui.subSections.sectionB.PanelB0800;
import medrex.client.mds3.ui.subSections.sectionB.PanelB1000;
import medrex.client.mds3.ui.subSections.sectionB.PanelB1200;
import medrex.client.mds3.ui.subSections.sectionB.PanelBHeader;
import medrex.client.mds3.ui.subSections.sectionB.PanelSubHeader;
import medrex.client.mds3.ui.subSections.sectionC.PanelC0100;
import medrex.client.mds3.ui.subSections.sectionC.PanelC0200;
import medrex.client.mds3.ui.subSections.sectionC.PanelC0300;
import medrex.client.mds3.ui.subSections.sectionC.PanelC0300A;
import medrex.client.mds3.ui.subSections.sectionC.PanelC0300B;
import medrex.client.mds3.ui.subSections.sectionC.PanelC0300C;
import medrex.client.mds3.ui.subSections.sectionC.PanelC0400;
import medrex.client.mds3.ui.subSections.sectionC.PanelC0400A;
import medrex.client.mds3.ui.subSections.sectionC.PanelC0400B;
import medrex.client.mds3.ui.subSections.sectionC.PanelC0400C;
import medrex.client.mds3.ui.subSections.sectionC.PanelC0500;
import medrex.client.mds3.ui.subSections.sectionC.PanelC0600;
import medrex.client.mds3.ui.subSections.sectionC.PanelC0700;
import medrex.client.mds3.ui.subSections.sectionC.PanelC0800;
import medrex.client.mds3.ui.subSections.sectionC.PanelC0900;
import medrex.client.mds3.ui.subSections.sectionC.PanelC1000;
import medrex.client.mds3.ui.subSections.sectionC.PanelC1300;
import medrex.client.mds3.ui.subSections.sectionC.PanelC1600;
import medrex.client.mds3.ui.subSections.sectionC.PanelCHeader;
import medrex.client.mds3.ui.subSections.sectionD.PanelD0200;
import medrex.client.mds3.ui.subSections.sectionD.PanelD0300;
import medrex.client.mds3.ui.subSections.sectionD.PanelD0350;
import medrex.client.mds3.ui.subSections.sectionD.PanelD0500;
import medrex.client.mds3.ui.subSections.sectionD.PanelD0600;
import medrex.client.mds3.ui.subSections.sectionD.PanelD0650;
import medrex.client.mds3.ui.subSections.sectionD.PanelDHeader;
import medrex.client.mds3.ui.subSections.sectionE.PanelBehavioralSymtoms;
import medrex.client.mds3.ui.subSections.sectionE.PanelE0100;
import medrex.client.mds3.ui.subSections.sectionE.PanelE0200;
import medrex.client.mds3.ui.subSections.sectionE.PanelE0300;
import medrex.client.mds3.ui.subSections.sectionE.PanelE0500;
import medrex.client.mds3.ui.subSections.sectionE.PanelE0600;
import medrex.client.mds3.ui.subSections.sectionE.PanelE0800;
import medrex.client.mds3.ui.subSections.sectionE.PanelE0900;
import medrex.client.mds3.ui.subSections.sectionE.PanelE1000;
import medrex.client.mds3.ui.subSections.sectionE.PanelE1100;
import medrex.client.mds3.ui.subSections.sectionE.PanelEHeader;
import medrex.client.mds3.ui.subSections.sectionF.PanelF0300;
import medrex.client.mds3.ui.subSections.sectionF.PanelF0400;
import medrex.client.mds3.ui.subSections.sectionF.PanelF0500;
import medrex.client.mds3.ui.subSections.sectionF.PanelF0600;
import medrex.client.mds3.ui.subSections.sectionF.PanelF0700;
import medrex.client.mds3.ui.subSections.sectionF.PanelF0800;
import medrex.client.mds3.ui.subSections.sectionF.PanelFHeader;
import medrex.client.mds3.ui.subSections.sectionG.PanelG0110;
import medrex.client.mds3.ui.subSections.sectionG.PanelG0110A;
import medrex.client.mds3.ui.subSections.sectionG.PanelG0110B;
import medrex.client.mds3.ui.subSections.sectionG.PanelG0120A;
import medrex.client.mds3.ui.subSections.sectionG.PanelG0120B;
import medrex.client.mds3.ui.subSections.sectionG.PanelG0300;
import medrex.client.mds3.ui.subSections.sectionG.PanelG0400;
import medrex.client.mds3.ui.subSections.sectionG.PanelG0600;
import medrex.client.mds3.ui.subSections.sectionG.PanelG0900A;
import medrex.client.mds3.ui.subSections.sectionG.PanelG0900B;
import medrex.client.mds3.ui.subSections.sectionG.PanelGHeader;
import medrex.client.mds3.ui.subSections.sectionH.PanelH0100;
import medrex.client.mds3.ui.subSections.sectionH.PanelH0200;
import medrex.client.mds3.ui.subSections.sectionH.PanelH0300;
import medrex.client.mds3.ui.subSections.sectionH.PanelH0400;
import medrex.client.mds3.ui.subSections.sectionH.PanelH0500;
import medrex.client.mds3.ui.subSections.sectionH.PanelH0600;
import medrex.client.mds3.ui.subSections.sectionH.PanelHHeader;
import medrex.client.mds3.ui.subSections.sectionI.PanelActiveDignosis;
import medrex.client.mds3.ui.subSections.sectionI.PanelCancer;
import medrex.client.mds3.ui.subSections.sectionI.PanelGastrointestinal;
import medrex.client.mds3.ui.subSections.sectionI.PanelGenitourinary;
import medrex.client.mds3.ui.subSections.sectionI.PanelHeartCirculation;
import medrex.client.mds3.ui.subSections.sectionI.PanelI0100;
import medrex.client.mds3.ui.subSections.sectionI.PanelI0200;
import medrex.client.mds3.ui.subSections.sectionI.PanelI0300;
import medrex.client.mds3.ui.subSections.sectionI.PanelI0400;
import medrex.client.mds3.ui.subSections.sectionI.PanelI0500;
import medrex.client.mds3.ui.subSections.sectionI.PanelI0600;
import medrex.client.mds3.ui.subSections.sectionI.PanelI0700;
import medrex.client.mds3.ui.subSections.sectionI.PanelI0800;
import medrex.client.mds3.ui.subSections.sectionI.PanelI0900;
import medrex.client.mds3.ui.subSections.sectionI.PanelI1100;
import medrex.client.mds3.ui.subSections.sectionI.PanelI1200;
import medrex.client.mds3.ui.subSections.sectionI.PanelI1300;
import medrex.client.mds3.ui.subSections.sectionI.PanelI1400;
import medrex.client.mds3.ui.subSections.sectionI.PanelI1500;
import medrex.client.mds3.ui.subSections.sectionI.PanelI1550;
import medrex.client.mds3.ui.subSections.sectionI.PanelI1650;
import medrex.client.mds3.ui.subSections.sectionI.PanelI1700;
import medrex.client.mds3.ui.subSections.sectionI.PanelI2000;
import medrex.client.mds3.ui.subSections.sectionI.PanelI2100;
import medrex.client.mds3.ui.subSections.sectionI.PanelI2200;
import medrex.client.mds3.ui.subSections.sectionI.PanelI2300;
import medrex.client.mds3.ui.subSections.sectionI.PanelI2400;
import medrex.client.mds3.ui.subSections.sectionI.PanelI2500;
import medrex.client.mds3.ui.subSections.sectionI.PanelI2900;
import medrex.client.mds3.ui.subSections.sectionI.PanelI3100;
import medrex.client.mds3.ui.subSections.sectionI.PanelI3200;
import medrex.client.mds3.ui.subSections.sectionI.PanelI3300;
import medrex.client.mds3.ui.subSections.sectionI.PanelI3400;
import medrex.client.mds3.ui.subSections.sectionI.PanelI3700;
import medrex.client.mds3.ui.subSections.sectionI.PanelI3800;
import medrex.client.mds3.ui.subSections.sectionI.PanelI3900;
import medrex.client.mds3.ui.subSections.sectionI.PanelI4000;
import medrex.client.mds3.ui.subSections.sectionI.PanelI4200;
import medrex.client.mds3.ui.subSections.sectionI.PanelI4300;
import medrex.client.mds3.ui.subSections.sectionI.PanelI4400;
import medrex.client.mds3.ui.subSections.sectionI.PanelI4500;
import medrex.client.mds3.ui.subSections.sectionI.PanelI4800;
import medrex.client.mds3.ui.subSections.sectionI.PanelI4900;
import medrex.client.mds3.ui.subSections.sectionI.PanelI5000;
import medrex.client.mds3.ui.subSections.sectionI.PanelI5100;
import medrex.client.mds3.ui.subSections.sectionI.PanelI5200;
import medrex.client.mds3.ui.subSections.sectionI.PanelI5250;
import medrex.client.mds3.ui.subSections.sectionI.PanelI5300;
import medrex.client.mds3.ui.subSections.sectionI.PanelI5350;
import medrex.client.mds3.ui.subSections.sectionI.PanelI5400;
import medrex.client.mds3.ui.subSections.sectionI.PanelI5500;
import medrex.client.mds3.ui.subSections.sectionI.PanelI5600;
import medrex.client.mds3.ui.subSections.sectionI.PanelI5700;
import medrex.client.mds3.ui.subSections.sectionI.PanelI5800;
import medrex.client.mds3.ui.subSections.sectionI.PanelI5900;
import medrex.client.mds3.ui.subSections.sectionI.PanelI5950;
import medrex.client.mds3.ui.subSections.sectionI.PanelI6000;
import medrex.client.mds3.ui.subSections.sectionI.PanelI6100;
import medrex.client.mds3.ui.subSections.sectionI.PanelI6200;
import medrex.client.mds3.ui.subSections.sectionI.PanelI6300;
import medrex.client.mds3.ui.subSections.sectionI.PanelI6500;
import medrex.client.mds3.ui.subSections.sectionI.PanelI8000;
import medrex.client.mds3.ui.subSections.sectionI.PanelIHeader;
import medrex.client.mds3.ui.subSections.sectionI.PanelInfections;
import medrex.client.mds3.ui.subSections.sectionI.PanelMetabolic;
import medrex.client.mds3.ui.subSections.sectionI.PanelMusculoskeletal;
import medrex.client.mds3.ui.subSections.sectionI.PanelNeurological;
import medrex.client.mds3.ui.subSections.sectionI.PanelNeurologicalDignosesContinued;
import medrex.client.mds3.ui.subSections.sectionI.PanelNutritional;
import medrex.client.mds3.ui.subSections.sectionI.PanelOther;
import medrex.client.mds3.ui.subSections.sectionI.PanelPsychiatricMoodDisorder;
import medrex.client.mds3.ui.subSections.sectionI.PanelPulmonary;
import medrex.client.mds3.ui.subSections.sectionI.PanelVision;
import medrex.client.mds3.ui.subSections.sectionJ.PanelJ0100;
import medrex.client.mds3.ui.subSections.sectionJ.PanelJ0200;
import medrex.client.mds3.ui.subSections.sectionJ.PanelJ0300;
import medrex.client.mds3.ui.subSections.sectionJ.PanelJ0400;
import medrex.client.mds3.ui.subSections.sectionJ.PanelJ0500;
import medrex.client.mds3.ui.subSections.sectionJ.PanelJ0600;
import medrex.client.mds3.ui.subSections.sectionJ.PanelJ0700;
import medrex.client.mds3.ui.subSections.sectionJ.PanelJ0800;
import medrex.client.mds3.ui.subSections.sectionJ.PanelJ0850;
import medrex.client.mds3.ui.subSections.sectionJ.PanelJ1100;
import medrex.client.mds3.ui.subSections.sectionJ.PanelJ1300;
import medrex.client.mds3.ui.subSections.sectionJ.PanelJ1400;
import medrex.client.mds3.ui.subSections.sectionJ.PanelJ1550;
import medrex.client.mds3.ui.subSections.sectionJ.PanelJ1700;
import medrex.client.mds3.ui.subSections.sectionJ.PanelJ1800;
import medrex.client.mds3.ui.subSections.sectionJ.PanelJ1900;
import medrex.client.mds3.ui.subSections.sectionJ.PanelJHeader;
import medrex.client.mds3.ui.subSections.sectionK.PanelK0100;
import medrex.client.mds3.ui.subSections.sectionK.PanelK0200;
import medrex.client.mds3.ui.subSections.sectionK.PanelK0300;
import medrex.client.mds3.ui.subSections.sectionK.PanelK0500;
import medrex.client.mds3.ui.subSections.sectionK.PanelK0700;
import medrex.client.mds3.ui.subSections.sectionK.PanelKHeader;
import medrex.client.mds3.ui.subSections.sectionL.PanelL0200;
import medrex.client.mds3.ui.subSections.sectionL.PanelLHeader;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0100;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0150;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0210;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0300;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0300A;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0300B;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0300C;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0300D;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0300E;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0300F;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0300G;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0610;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0610A;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0610B;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0610C;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0700;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0800;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0800A;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0800B;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0800C;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0900;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0900A;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0900B;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0900C;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0900D;
import medrex.client.mds3.ui.subSections.sectionM.PanelM1030;
import medrex.client.mds3.ui.subSections.sectionM.PanelM1040;
import medrex.client.mds3.ui.subSections.sectionM.PanelM1200;
import medrex.client.mds3.ui.subSections.sectionM.PanelMHeader;
import medrex.client.mds3.ui.subSections.sectionM.PanelMSubHeader;
import medrex.client.mds3.ui.subSections.sectionN.PanelN0300;
import medrex.client.mds3.ui.subSections.sectionN.PanelN0350;
import medrex.client.mds3.ui.subSections.sectionN.PanelN0400;
import medrex.client.mds3.ui.subSections.sectionN.PanelNHeader;
import medrex.client.mds3.ui.subSections.sectionO.PanelO0100;
import medrex.client.mds3.ui.subSections.sectionO.PanelO0250;
import medrex.client.mds3.ui.subSections.sectionO.PanelO0300;
import medrex.client.mds3.ui.subSections.sectionO.PanelO0400A;
import medrex.client.mds3.ui.subSections.sectionO.PanelO0400B;
import medrex.client.mds3.ui.subSections.sectionO.PanelO0400C;
import medrex.client.mds3.ui.subSections.sectionO.PanelO0400D;
import medrex.client.mds3.ui.subSections.sectionO.PanelO0400E;
import medrex.client.mds3.ui.subSections.sectionO.PanelO0400F;
import medrex.client.mds3.ui.subSections.sectionO.PanelO0500;
import medrex.client.mds3.ui.subSections.sectionO.PanelO0600;
import medrex.client.mds3.ui.subSections.sectionO.PanelO0700;
import medrex.client.mds3.ui.subSections.sectionO.PanelOHeader;
import medrex.client.mds3.ui.subSections.sectionP.PanelP100;
import medrex.client.mds3.ui.subSections.sectionP.PanelPHeader;
import medrex.client.mds3.ui.subSections.sectionQ.PanelQ0100;
import medrex.client.mds3.ui.subSections.sectionQ.PanelQ0300;
import medrex.client.mds3.ui.subSections.sectionQ.PanelQ0400;
import medrex.client.mds3.ui.subSections.sectionQ.PanelQ0500;
import medrex.client.mds3.ui.subSections.sectionQ.PanelQ0600;
import medrex.client.mds3.ui.subSections.sectionQ.PanelQHeader;
import medrex.client.mds3.ui.subSections.sectionV.PanelV0100;
import medrex.client.mds3.ui.subSections.sectionV.PanelV0200;
import medrex.client.mds3.ui.subSections.sectionV.PanelVHeader;
import medrex.client.mds3.ui.subSections.sectionX.PanelX0100;
import medrex.client.mds3.ui.subSections.sectionX.PanelX0150;
import medrex.client.mds3.ui.subSections.sectionX.PanelX0200;
import medrex.client.mds3.ui.subSections.sectionX.PanelX0300;
import medrex.client.mds3.ui.subSections.sectionX.PanelX0400;
import medrex.client.mds3.ui.subSections.sectionX.PanelX0500;
import medrex.client.mds3.ui.subSections.sectionX.PanelX0600;
import medrex.client.mds3.ui.subSections.sectionX.PanelX0600A;
import medrex.client.mds3.ui.subSections.sectionX.PanelX0600B;
import medrex.client.mds3.ui.subSections.sectionX.PanelX0600C;
import medrex.client.mds3.ui.subSections.sectionX.PanelX0600Continued;
import medrex.client.mds3.ui.subSections.sectionX.PanelX0600D;
import medrex.client.mds3.ui.subSections.sectionX.PanelX0600F;
import medrex.client.mds3.ui.subSections.sectionX.PanelX0700;
import medrex.client.mds3.ui.subSections.sectionX.PanelX0800;
import medrex.client.mds3.ui.subSections.sectionX.PanelX0900;
import medrex.client.mds3.ui.subSections.sectionX.PanelX1050;
import medrex.client.mds3.ui.subSections.sectionX.PanelX1100;
import medrex.client.mds3.ui.subSections.sectionX.PanelXHeader;
import medrex.client.mds3.ui.subSections.sectionZ.PanelZ0100;
import medrex.client.mds3.ui.subSections.sectionZ.PanelZ0150;
import medrex.client.mds3.ui.subSections.sectionZ.PanelZ0200;
import medrex.client.mds3.ui.subSections.sectionZ.PanelZ0250;
import medrex.client.mds3.ui.subSections.sectionZ.PanelZ0300;
import medrex.client.mds3.ui.subSections.sectionZ.PanelZ0400;
import medrex.client.mds3.ui.subSections.sectionZ.PanelZ0500;
import medrex.client.mds3.ui.subSections.sectionZ.PanelZHeader;

public class Mds3ItemSetNC {

	public static Mds3ItemSet getNCItemSet() {

		Mds3ItemSet nc1ItemSet = new Mds3ItemSet();
		nc1ItemSet.getPages().put("1", getNCPage1());
		nc1ItemSet.getPages().put("2", getNCPage2());
		nc1ItemSet.getPages().put("3", getNCPage3());
		nc1ItemSet.getPages().put("4", getNCPage4());
		nc1ItemSet.getPages().put("5", getNCPage5());
		nc1ItemSet.getPages().put("6", getNCPage6());
		nc1ItemSet.getPages().put("7", getNCPage7());
		nc1ItemSet.getPages().put("8", getNCPage8());
		nc1ItemSet.getPages().put("9", getNCPage9());
		nc1ItemSet.getPages().put("10", getNCPage10());
		nc1ItemSet.getPages().put("11", getNCPage11());
		nc1ItemSet.getPages().put("12", getNCPage12());
		nc1ItemSet.getPages().put("13", getNCPage13());
		nc1ItemSet.getPages().put("14", getNCPage14());
		nc1ItemSet.getPages().put("15", getNCPage15());
		nc1ItemSet.getPages().put("16", getNCPage16());
		nc1ItemSet.getPages().put("17", getNCPage17());
		nc1ItemSet.getPages().put("18", getNCPage18());
		nc1ItemSet.getPages().put("19", getNCPage19());
		nc1ItemSet.getPages().put("20", getNCPage20());
		nc1ItemSet.getPages().put("21", getNCPage21());
		nc1ItemSet.getPages().put("22", getNCPage22());
		nc1ItemSet.getPages().put("23", getNCPage23());
		nc1ItemSet.getPages().put("24", getNCPage24());
		nc1ItemSet.getPages().put("25", getNCPage25());
		nc1ItemSet.getPages().put("26", getNCPage26());
		nc1ItemSet.getPages().put("27", getNCPage27());
		nc1ItemSet.getPages().put("28", getNCPage28());
		nc1ItemSet.getPages().put("29", getNCPage29());
		nc1ItemSet.getPages().put("30", getNCPage30());
		nc1ItemSet.getPages().put("31", getNCPage31());
		nc1ItemSet.getPages().put("32", getNCPage32());
		nc1ItemSet.getPages().put("33", getNCPage33());
		nc1ItemSet.getPages().put("34", getNCPage34());
		nc1ItemSet.getPages().put("35", getNCPage35());
		nc1ItemSet.getPages().put("36", getNCPage36());
		nc1ItemSet.getPages().put("37", getNCPage37());
		nc1ItemSet.getPages().put("38", getNCPage38());
		return nc1ItemSet;

	}

	private static Mds3Page getNCPage1() {
		// created page1
		Mds3Page ncPage1 = new Mds3Page();
		ncPage1.getSubSections().add(new Mds3Header());
		ncPage1.getSubSections().add(new PanelHeader());
		ncPage1.getSubSections().add(new PanelAHeader());
		ncPage1.getSubSections().add(new PanelA0100());
		ncPage1.getSubSections().add(new PanelA0200());
		// ncPage1.getSubSections().add(new PanelA0310());
		ncPage1.getSubSections().add(new PanelA0310A());
		ncPage1.getSubSections().add(new PanelA0310B());
		ncPage1.getSubSections().add(new PanelA0310C());
		ncPage1.getSubSections().add(new PanelA0310D());
		ncPage1.getSubSections().add(new PanelA0310E());
		ncPage1.getSubSections().add(new PanelA0310F());
		ncPage1.getSubSections().add(new Mds3Footer());
		return (ncPage1);

	}

	private static Mds3Page getNCPage2() {
		// creating page 2
		Mds3Page ncPage2 = new Mds3Page();
		ncPage2.getSubSections().add(new Mds3Header());
		ncPage2.getSubSections().add(new PanelAHeader());
		ncPage2.getSubSections().add(new PanelA0410());
		ncPage2.getSubSections().add(new PanelA0500());
		ncPage2.getSubSections().add(new PanelA0600());
		ncPage2.getSubSections().add(new PanelA0700());
		ncPage2.getSubSections().add(new PanelA0800());
		ncPage2.getSubSections().add(new PanelA0900());
		ncPage2.getSubSections().add(new PanelA1000());
		ncPage2.getSubSections().add(new PanelA1100());
		ncPage2.getSubSections().add(new Mds3Footer());
		return ncPage2;
	}

	private static Mds3Page getNCPage3() {
		// creating page 3
		Mds3Page ncPage3 = new Mds3Page();
		ncPage3.getSubSections().add(new Mds3Header());
		ncPage3.getSubSections().add(new PanelAHeader());
		ncPage3.getSubSections().add(new PanelA1200());
		ncPage3.getSubSections().add(new PanelA1300());
		ncPage3.getSubSections().add(new PanelA1500());
		ncPage3.getSubSections().add(new PanelA1550());
		ncPage3.getSubSections().add(new PanelA1600());
		ncPage3.getSubSections().add(new PanelA1700());
		ncPage3.getSubSections().add(new Mds3Footer());

		return ncPage3;
	}

	private static Mds3Page getNCPage4() {
		// creating page 4
		Mds3Page ncPage4 = new Mds3Page();
		ncPage4.getSubSections().add(new Mds3Header());
		ncPage4.getSubSections().add(new PanelAHeader());
		ncPage4.getSubSections().add(new PanelA1800());
		ncPage4.getSubSections().add(new PanelA2000());
		ncPage4.getSubSections().add(new PanelA2100());
		ncPage4.getSubSections().add(new PanelA2200());
		ncPage4.getSubSections().add(new PanelA2300());
		ncPage4.getSubSections().add(new PanelA2400());
		ncPage4.getSubSections().add(new Mds3Footer());
		return ncPage4;
	}

	private static Mds3Page getNCPage5() {
		// creating page 5
		Mds3Page ncPage5 = new Mds3Page();
		ncPage5.getSubSections().add(new Mds3Header());
		ncPage5.getSubSections().add(new PanelSubHeader());
		ncPage5.getSubSections().add(new PanelBHeader());
		ncPage5.getSubSections().add(new PanelB0100());
		ncPage5.getSubSections().add(new PanelB0200());
		ncPage5.getSubSections().add(new PanelB0300());
		ncPage5.getSubSections().add(new PanelB0600());
		ncPage5.getSubSections().add(new PanelB0700());
		ncPage5.getSubSections().add(new PanelB0800());
		ncPage5.getSubSections().add(new PanelB1000());
		ncPage5.getSubSections().add(new PanelB1200());
		ncPage5.getSubSections().add(new Mds3Footer());

		return ncPage5;

	}

	private static Mds3Page getNCPage6() {
		// creating page 6
		Mds3Page ncPage6 = new Mds3Page();
		ncPage6.getSubSections().add(new Mds3Header());
		ncPage6.getSubSections().add(new PanelCHeader());
		ncPage6.getSubSections().add(new PanelC0100());
		ncPage6.getSubSections().add(new PanelC0200());
		ncPage6.getSubSections().add(new PanelC0300());
		ncPage6.getSubSections().add(new PanelC0300A());
		ncPage6.getSubSections().add(new PanelC0300B());
		ncPage6.getSubSections().add(new PanelC0300C());
		ncPage6.getSubSections().add(new PanelC0400());
		ncPage6.getSubSections().add(new PanelC0400A());
		ncPage6.getSubSections().add(new PanelC0400B());
		ncPage6.getSubSections().add(new PanelC0400C());
		ncPage6.getSubSections().add(new PanelC0500());
		ncPage6.getSubSections().add(new Mds3Footer());
		return ncPage6;

	}

	private static Mds3Page getNCPage7() {
		// creating page 7
		Mds3Page ncPage7 = new Mds3Page();
		ncPage7.getSubSections().add(new Mds3Header());
		ncPage7.getSubSections().add(new PanelCHeader());
		ncPage7.getSubSections().add(new PanelC0600());
		ncPage7.getSubSections().add(new PanelC0700());
		ncPage7.getSubSections().add(new PanelC0800());
		ncPage7.getSubSections().add(new PanelC0900());
		ncPage7.getSubSections().add(new PanelC1000());
		ncPage7.getSubSections().add(new PanelC1300());
		ncPage7.getSubSections().add(new PanelC1600());
		ncPage7.getSubSections().add(new Mds3Footer());
		return ncPage7;
	}

	private static Mds3Page getNCPage8() {
		Mds3Page ncPage8 = new Mds3Page();
		ncPage8.getSubSections().add(new Mds3Header());
		ncPage8.getSubSections().add(new PanelDHeader());
		ncPage8.getSubSections().add(new PanelD0200());
		ncPage8.getSubSections().add(new PanelD0300());
		ncPage8.getSubSections().add(new PanelD0350());
		ncPage8.getSubSections().add(new Mds3Footer());
		return ncPage8;

	}

	private static Mds3Page getNCPage9() {
		Mds3Page ncPage9 = new Mds3Page();
		ncPage9.getSubSections().add(new Mds3Header());
		ncPage9.getSubSections().add(new PanelDHeader());
		ncPage9.getSubSections().add(new PanelD0500());
		ncPage9.getSubSections().add(new PanelD0600());
		ncPage9.getSubSections().add(new PanelD0650());
		ncPage9.getSubSections().add(new Mds3Footer());
		return ncPage9;
	}

	private static Mds3Page getNCPage10() {
		Mds3Page ncPage10 = new Mds3Page();
		ncPage10.getSubSections().add(new Mds3Header());
		ncPage10.getSubSections().add(new PanelEHeader());
		ncPage10.getSubSections().add(new PanelBehavioralSymtoms());
		ncPage10.getSubSections().add(new PanelE0100());
		ncPage10.getSubSections().add(new PanelE0200());
		ncPage10.getSubSections().add(new PanelE0300());
		ncPage10.getSubSections().add(new PanelE0500());
		ncPage10.getSubSections().add(new PanelE0600());
		ncPage10.getSubSections().add(new PanelE0800());
		ncPage10.getSubSections().add(new Mds3Footer());
		return ncPage10;
	}

	private static Mds3Page getNCPage11() {
		Mds3Page ncPage11 = new Mds3Page();
		ncPage11.getSubSections().add(new Mds3Header());
		ncPage11.getSubSections().add(new PanelEHeader());
		ncPage11.getSubSections().add(new PanelE0900());
		ncPage11.getSubSections().add(new PanelE1000());
		ncPage11.getSubSections().add(new PanelE1100());
		ncPage11.getSubSections().add(new Mds3Footer());
		return ncPage11;
	}

	private static Mds3Page getNCPage12() {
		Mds3Page ncPage12 = new Mds3Page();
		ncPage12.getSubSections().add(new Mds3Header());
		ncPage12.getSubSections().add(new PanelFHeader());
		ncPage12.getSubSections().add(new PanelF0300());
		ncPage12.getSubSections().add(new PanelF0400());
		ncPage12.getSubSections().add(new PanelF0500());
		ncPage12.getSubSections().add(new PanelF0600());
		ncPage12.getSubSections().add(new Mds3Footer());
		return ncPage12;
	}

	private static Mds3Page getNCPage13() {
		Mds3Page ncPage13 = new Mds3Page();
		ncPage13.getSubSections().add(new PanelFHeader());
		ncPage13.getSubSections().add(new PanelF0700());
		ncPage13.getSubSections().add(new PanelF0800());
		ncPage13.getSubSections().add(new Mds3Footer());
		return ncPage13;
	}

	private static Mds3Page getNCPage14() {
		Mds3Page ncPage14 = new Mds3Page();
		ncPage14.getSubSections().add(new Mds3Header());
		ncPage14.getSubSections().add(new PanelGHeader());
		ncPage14.getSubSections().add(new PanelG0110());
		ncPage14.getSubSections().add(new PanelG0110A());
		ncPage14.getSubSections().add(new PanelG0110B());
		ncPage14.getSubSections().add(new Mds3Footer());
		return ncPage14;
	}

	private static Mds3Page getNCPage15() {
		Mds3Page ncPage15 = new Mds3Page();
		ncPage15.getSubSections().add(new Mds3Header());
		ncPage15.getSubSections().add(new PanelGHeader());
		ncPage15.getSubSections().add(new PanelG0120A());
		ncPage15.getSubSections().add(new PanelG0120B());
		ncPage15.getSubSections().add(new PanelG0300());
		ncPage15.getSubSections().add(new PanelG0400());
		ncPage15.getSubSections().add(new PanelG0600());
		ncPage15.getSubSections().add(new PanelG0900A());
		ncPage15.getSubSections().add(new PanelG0900B());
		ncPage15.getSubSections().add(new Mds3Footer());
		return ncPage15;
	}

	private static Mds3Page getNCPage16() {
		Mds3Page ncPage16 = new Mds3Page();
		ncPage16.getSubSections().add(new Mds3Header());
		ncPage16.getSubSections().add(new PanelHHeader());
		ncPage16.getSubSections().add(new PanelH0100());
		ncPage16.getSubSections().add(new PanelH0200());
		ncPage16.getSubSections().add(new PanelH0300());
		ncPage16.getSubSections().add(new PanelH0400());
		ncPage16.getSubSections().add(new PanelH0500());
		ncPage16.getSubSections().add(new PanelH0600());
		ncPage16.getSubSections().add(new Mds3Footer());
		return ncPage16;
	}

	private static Mds3Page getNCPage17() {
		Mds3Page ncPage17 = new Mds3Page();
		ncPage17.getSubSections().add(new Mds3Header());
		ncPage17.getSubSections().add(new PanelIHeader());
		ncPage17.getSubSections().add(new PanelActiveDignosis());
		ncPage17.getSubSections().add(new PanelCancer());
		ncPage17.getSubSections().add(new PanelI0100());
		ncPage17.getSubSections().add(new PanelHeartCirculation());
		ncPage17.getSubSections().add(new PanelI0200());
		ncPage17.getSubSections().add(new PanelI0300());
		ncPage17.getSubSections().add(new PanelI0400());
		ncPage17.getSubSections().add(new PanelI0500());
		ncPage17.getSubSections().add(new PanelI0600());
		ncPage17.getSubSections().add(new PanelI0700());
		ncPage17.getSubSections().add(new PanelI0800());
		ncPage17.getSubSections().add(new PanelI0900());
		ncPage17.getSubSections().add(new PanelGastrointestinal());
		ncPage17.getSubSections().add(new PanelI1100());
		ncPage17.getSubSections().add(new PanelI1200());
		ncPage17.getSubSections().add(new PanelI1300());
		ncPage17.getSubSections().add(new PanelGenitourinary());
		ncPage17.getSubSections().add(new PanelI1400());
		ncPage17.getSubSections().add(new PanelI1500());
		ncPage17.getSubSections().add(new PanelI1550());
		ncPage17.getSubSections().add(new PanelI1650());
		ncPage17.getSubSections().add(new PanelInfections());
		ncPage17.getSubSections().add(new PanelI1700());
		ncPage17.getSubSections().add(new PanelI2000());
		ncPage17.getSubSections().add(new PanelI2100());
		ncPage17.getSubSections().add(new PanelI2200());
		ncPage17.getSubSections().add(new PanelI2300());
		ncPage17.getSubSections().add(new PanelI2400());
		ncPage17.getSubSections().add(new PanelI2500());
		ncPage17.getSubSections().add(new PanelMetabolic());
		ncPage17.getSubSections().add(new PanelI2900());
		ncPage17.getSubSections().add(new PanelI3100());
		ncPage17.getSubSections().add(new PanelI3200());
		ncPage17.getSubSections().add(new PanelI3300());
		ncPage17.getSubSections().add(new PanelI3400());
		ncPage17.getSubSections().add(new PanelMusculoskeletal());
		ncPage17.getSubSections().add(new PanelI3700());
		ncPage17.getSubSections().add(new PanelI3800());
		ncPage17.getSubSections().add(new PanelI3900());
		ncPage17.getSubSections().add(new PanelI4000());
		ncPage17.getSubSections().add(new PanelNeurological());
		ncPage17.getSubSections().add(new PanelI4200());
		ncPage17.getSubSections().add(new PanelI4300());
		ncPage17.getSubSections().add(new PanelI4400());
		ncPage17.getSubSections().add(new PanelI4500());
		ncPage17.getSubSections().add(new PanelI4800());
		ncPage17.getSubSections().add(new PanelNeurologicalDignosesContinued());
		ncPage17.getSubSections().add(new Mds3Footer());
		return ncPage17;
	}

	private static Mds3Page getNCPage18() {
		Mds3Page ncPage18 = new Mds3Page();
		ncPage18.getSubSections().add(new Mds3Header());
		ncPage18.getSubSections().add(new PanelIHeader());
		ncPage18.getSubSections().add(new PanelActiveDignosis());
		ncPage18.getSubSections().add(new PanelNeurological());
		ncPage18.getSubSections().add(new PanelI4900());
		ncPage18.getSubSections().add(new PanelI5000());
		ncPage18.getSubSections().add(new PanelI5100());
		ncPage18.getSubSections().add(new PanelI5200());
		ncPage18.getSubSections().add(new PanelI5250());
		ncPage18.getSubSections().add(new PanelI5300());
		ncPage18.getSubSections().add(new PanelI5350());
		ncPage18.getSubSections().add(new PanelI5400());
		ncPage18.getSubSections().add(new PanelI5500());
		ncPage18.getSubSections().add(new PanelNutritional());
		ncPage18.getSubSections().add(new PanelI5600());
		ncPage18.getSubSections().add(new PanelPsychiatricMoodDisorder());
		ncPage18.getSubSections().add(new PanelI5700());
		ncPage18.getSubSections().add(new PanelI5800());
		ncPage18.getSubSections().add(new PanelI5900());
		ncPage18.getSubSections().add(new PanelI5950());
		ncPage18.getSubSections().add(new PanelI6000());
		ncPage18.getSubSections().add(new PanelI6100());
		ncPage18.getSubSections().add(new PanelPulmonary());
		ncPage18.getSubSections().add(new PanelI6200());
		ncPage18.getSubSections().add(new PanelI6300());
		ncPage18.getSubSections().add(new PanelVision());
		ncPage18.getSubSections().add(new PanelI6500());
		ncPage18.getSubSections().add(new PanelOther());
		ncPage18.getSubSections().add(new PanelI8000());
		ncPage18.getSubSections().add(new Mds3Footer());
		return ncPage18;
	}

	private static Mds3Page getNCPage19() {
		Mds3Page ncPage19 = new Mds3Page();
		ncPage19.getSubSections().add(new Mds3Header());
		ncPage19.getSubSections().add(new PanelJHeader());
		ncPage19.getSubSections().add(new PanelJ0100());
		ncPage19.getSubSections().add(new PanelJ0200());
		ncPage19.getSubSections().add(new PanelJ0300());
		ncPage19.getSubSections().add(new PanelJ0400());
		ncPage19.getSubSections().add(new PanelJ0500());
		ncPage19.getSubSections().add(new PanelJ0600());
		ncPage19.getSubSections().add(new Mds3Footer());
		return ncPage19;
	}

	private static Mds3Page getNCPage20() {
		Mds3Page ncPage20 = new Mds3Page();
		ncPage20.getSubSections().add(new Mds3Header());
		ncPage20.getSubSections().add(new PanelJHeader());
		ncPage20.getSubSections().add(new PanelJ0700());
		ncPage20.getSubSections().add(new PanelJ0800());
		ncPage20.getSubSections().add(new PanelJ0850());
		ncPage20.getSubSections().add(new PanelJ1100());
		ncPage20.getSubSections().add(new PanelJ1300());
		ncPage20.getSubSections().add(new PanelJ1400());
		ncPage20.getSubSections().add(new PanelJ1550());
		ncPage20.getSubSections().add(new Mds3Footer());
		return ncPage20;
	}

	private static Mds3Page getNCPage21() {
		Mds3Page ncPage21 = new Mds3Page();
		ncPage21.getSubSections().add(new Mds3Header());
		ncPage21.getSubSections().add(new PanelJHeader());
		ncPage21.getSubSections().add(new PanelJ1700());
		ncPage21.getSubSections().add(new PanelJ1800());
		ncPage21.getSubSections().add(new PanelJ1900());
		ncPage21.getSubSections().add(new Mds3Footer());
		return ncPage21;
	}

	private static Mds3Page getNCPage22() {
		Mds3Page ncPage22 = new Mds3Page();
		ncPage22.getSubSections().add(new Mds3Header());
		ncPage22.getSubSections().add(new PanelKHeader());
		ncPage22.getSubSections().add(new PanelK0100());
		ncPage22.getSubSections().add(new PanelK0200());
		ncPage22.getSubSections().add(new PanelK0300());
		ncPage22.getSubSections().add(new PanelK0500());
		ncPage22.getSubSections().add(new PanelK0700());
		ncPage22.getSubSections().add(new PanelLHeader());
		ncPage22.getSubSections().add(new PanelL0200());
		ncPage22.getSubSections().add(new Mds3Footer());
		return ncPage22;
	}

	private static Mds3Page getNCPage23() {
		Mds3Page ncPage23 = new Mds3Page();
		ncPage23.getSubSections().add(new Mds3Header());
		ncPage23.getSubSections().add(new PanelMHeader());
		ncPage23.getSubSections().add(new PanelMSubHeader());
		ncPage23.getSubSections().add(new PanelM0100());
		ncPage23.getSubSections().add(new PanelM0150());
		ncPage23.getSubSections().add(new PanelM0210());
		ncPage23.getSubSections().add(new PanelM0300());
		ncPage23.getSubSections().add(new PanelM0300A());
		ncPage23.getSubSections().add(new PanelM0300B());
		ncPage23.getSubSections().add(new PanelM0300C());
		ncPage23.getSubSections().add(new PanelM0300D());
		ncPage23.getSubSections().add(new Mds3Footer());

		return ncPage23;
	}

	private static Mds3Page getNCPage24() {
		Mds3Page ncPage24 = new Mds3Page();
		ncPage24.getSubSections().add(new Mds3Header());
		ncPage24.getSubSections().add(new PanelMHeader());
		ncPage24.getSubSections().add(new PanelSubHeader());
		ncPage24.getSubSections().add(new PanelM0300());
		ncPage24.getSubSections().add(new PanelM0300E());
		ncPage24.getSubSections().add(new PanelM0300F());
		ncPage24.getSubSections().add(new PanelM0300G());
		ncPage24.getSubSections().add(new PanelM0610());
		ncPage24.getSubSections().add(new PanelM0610A());
		ncPage24.getSubSections().add(new PanelM0610B());
		ncPage24.getSubSections().add(new PanelM0610C());
		ncPage24.getSubSections().add(new PanelM0700());
		ncPage24.getSubSections().add(new PanelM0800());
		ncPage24.getSubSections().add(new PanelM0800A());
		ncPage24.getSubSections().add(new PanelM0800B());
		ncPage24.getSubSections().add(new PanelM0800C());
		ncPage24.getSubSections().add(new Mds3Footer());
		return ncPage24;
	}

	private static Mds3Page getNCPage25() {
		Mds3Page ncPage25 = new Mds3Page();
		ncPage25.getSubSections().add(new Mds3Header());
		ncPage25.getSubSections().add(new PanelMHeader());
		ncPage25.getSubSections().add(new PanelM0900());
		ncPage25.getSubSections().add(new PanelM0900A());
		ncPage25.getSubSections().add(new PanelM0900B());
		ncPage25.getSubSections().add(new PanelM0900C());
		ncPage25.getSubSections().add(new PanelM0900D());
		ncPage25.getSubSections().add(new PanelM1030());
		ncPage25.getSubSections().add(new PanelM1040());
		ncPage25.getSubSections().add(new PanelM1200());
		ncPage25.getSubSections().add(new Mds3Footer());
		return ncPage25;
	}

	private static Mds3Page getNCPage26() {

		Mds3Page ncPage26 = new Mds3Page();
		ncPage26.getSubSections().add(new PanelNHeader());
		ncPage26.getSubSections().add(new PanelN0300());
		ncPage26.getSubSections().add(new PanelN0350());
		ncPage26.getSubSections().add(new PanelN0400());
		ncPage26.getSubSections().add(new Mds3Footer());
		return ncPage26;
	}

	private static Mds3Page getNCPage27() {
		Mds3Page ncPage27 = new Mds3Page();
		ncPage27.getSubSections().add(new Mds3Header());
		ncPage27.getSubSections().add(new PanelOHeader());
		ncPage27.getSubSections().add(new PanelO0100());
		ncPage27.getSubSections().add(new PanelO0250());
		ncPage27.getSubSections().add(new PanelO0300());
		ncPage27.getSubSections().add(new Mds3Footer());
		return ncPage27;
	}

	private static Mds3Page getNCPage28() {
		Mds3Page ncPage28 = new Mds3Page();
		ncPage28.getSubSections().add(new Mds3Header());
		ncPage28.getSubSections().add(new PanelOHeader());
		ncPage28.getSubSections().add(new PanelO0400A());
		ncPage28.getSubSections().add(new PanelO0400B());
		ncPage28.getSubSections().add(new PanelO0400C());
		ncPage28.getSubSections().add(new PanelO0400D());
		ncPage28.getSubSections().add(new Mds3Footer());
		return ncPage28;
	}

	private static Mds3Page getNCPage29() {
		Mds3Page ncPage29 = new Mds3Page();
		ncPage29.getSubSections().add(new Mds3Header());
		ncPage29.getSubSections().add(new PanelOHeader());
		ncPage29.getSubSections().add(new PanelO0400D());
		ncPage29.getSubSections().add(new PanelO0400E());
		ncPage29.getSubSections().add(new PanelO0400F());
		ncPage29.getSubSections().add(new PanelO0500());
		ncPage29.getSubSections().add(new PanelO0600());
		ncPage29.getSubSections().add(new PanelO0700());
		ncPage29.getSubSections().add(new Mds3Footer());
		return ncPage29;
	}

	private static Mds3Page getNCPage30() {
		Mds3Page ncPage30 = new Mds3Page();
		ncPage30.getSubSections().add(new Mds3Header());
		ncPage30.getSubSections().add(new PanelPHeader());
		ncPage30.getSubSections().add(new PanelP100());
		ncPage30.getSubSections().add(new Mds3Footer());
		return ncPage30;
	}

	private static Mds3Page getNCPage31() {
		Mds3Page ncPage31 = new Mds3Page();
		ncPage31.getSubSections().add(new Mds3Header());
		ncPage31.getSubSections().add(new PanelQHeader());
		ncPage31.getSubSections().add(new PanelQ0100());
		ncPage31.getSubSections().add(new PanelQ0300());
		ncPage31.getSubSections().add(new PanelQ0400());
		ncPage31.getSubSections().add(new PanelQ0500());
		ncPage31.getSubSections().add(new PanelQ0600());
		ncPage31.getSubSections().add(new Mds3Footer());
		return ncPage31;
	}

	private static Mds3Page getNCPage32() {
		Mds3Page ncPage32 = new Mds3Page();
		ncPage32.getSubSections().add(new Mds3Header());
		ncPage32.getSubSections().add(new PanelVHeader());
		ncPage32.getSubSections().add(new PanelV0100());
		ncPage32.getSubSections().add(new Mds3Footer());
		return ncPage32;
	}

	private static Mds3Page getNCPage33() {
		Mds3Page ncPage33 = new Mds3Page();
		ncPage33.getSubSections().add(new Mds3Header());
		ncPage33.getSubSections().add(new PanelVHeader());
		ncPage33.getSubSections().add(new PanelV0200());
		ncPage33.getSubSections().add(new Mds3Footer());
		return ncPage33;
	}

	private static Mds3Page getNCPage34() {

		Mds3Page ncPage34 = new Mds3Page();
		ncPage34.getSubSections().add(new Mds3Header());
		ncPage34.getSubSections().add(new PanelXHeader());
		ncPage34.getSubSections().add(new PanelX0100());
		ncPage34.getSubSections().add(new PanelX0150());
		ncPage34.getSubSections().add(new PanelX0200());
		ncPage34.getSubSections().add(new PanelX0300());
		ncPage34.getSubSections().add(new PanelX0400());
		ncPage34.getSubSections().add(new PanelX0500());
		ncPage34.getSubSections().add(new PanelX0600());
		ncPage34.getSubSections().add(new PanelX0600A());
		ncPage34.getSubSections().add(new PanelX0600B());
		ncPage34.getSubSections().add(new PanelX0600C());
		ncPage34.getSubSections().add(new Mds3Footer());
		return ncPage34;
	}

	private static Mds3Page getNCPage35() {

		Mds3Page ncPage35 = new Mds3Page();
		ncPage35.getSubSections().add(new Mds3Header());
		ncPage35.getSubSections().add(new PanelXHeader());
		ncPage35.getSubSections().add(new PanelX0600Continued());
		ncPage35.getSubSections().add(new PanelX0600D());
		ncPage35.getSubSections().add(new PanelX0600F());
		ncPage35.getSubSections().add(new PanelX0700());
		ncPage35.getSubSections().add(new PanelX0800());
		ncPage35.getSubSections().add(new PanelX0900());
		ncPage35.getSubSections().add(new PanelX1050());
		ncPage35.getSubSections().add(new Mds3Footer());
		return ncPage35;
	}

	private static Mds3Page getNCPage36() {

		Mds3Page ncPage36 = new Mds3Page();
		ncPage36.getSubSections().add(new Mds3Header());
		ncPage36.getSubSections().add(new PanelXHeader());
		ncPage36.getSubSections().add(new PanelX1100());
		ncPage36.getSubSections().add(new Mds3Footer());
		return ncPage36;
	}

	private static Mds3Page getNCPage37() {

		Mds3Page ncPage37 = new Mds3Page();
		ncPage37.getSubSections().add(new Mds3Header());
		ncPage37.getSubSections().add(new PanelZHeader());
		ncPage37.getSubSections().add(new PanelZ0100());
		ncPage37.getSubSections().add(new PanelZ0150());
		ncPage37.getSubSections().add(new PanelZ0200());
		ncPage37.getSubSections().add(new PanelZ0250());
		ncPage37.getSubSections().add(new PanelZ0300());
		ncPage37.getSubSections().add(new Mds3Footer());
		return ncPage37;
	}

	private static Mds3Page getNCPage38() {

		Mds3Page ncPage38 = new Mds3Page();
		ncPage38.getSubSections().add(new Mds3Header());
		ncPage38.getSubSections().add(new PanelZHeader());
		ncPage38.getSubSections().add(new PanelZ0400());
		ncPage38.getSubSections().add(new PanelZ0500());
		ncPage38.getSubSections().add(new Mds3Footer());
		return ncPage38;
	}

}
