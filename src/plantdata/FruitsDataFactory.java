package plantdata;

import java.awt.Image;

import javax.swing.ImageIcon;

public class FruitsDataFactory {

	public static FruitsData getFruitsData(String name) {
		ImageIcon pineappleguavaicon = new ImageIcon("D:\\Eclipse Project\\GardenApp\\src\\pinappleguava.jpg");
		Image newimg = pineappleguavaicon.getImage().getScaledInstance(250, 250, java.awt.Image.SCALE_SMOOTH);
		pineappleguavaicon = new ImageIcon(newimg);
		ImageIcon kiwivineicon = new ImageIcon("D:\\Eclipse Project\\GardenApp\\src\\kiwivine.jpg");
		Image newimg1 = kiwivineicon.getImage().getScaledInstance(250, 250, java.awt.Image.SCALE_SMOOTH);
		kiwivineicon = new ImageIcon(newimg1);
		ImageIcon kiwifruiticon = new ImageIcon("D:\\Eclipse Project\\GardenApp\\src\\kiwifruit.jpg");
		Image newimg2 = kiwifruiticon.getImage().getScaledInstance(250, 250, java.awt.Image.SCALE_SMOOTH);
		kiwifruiticon = new ImageIcon(newimg2);
		ImageIcon clementineicon = new ImageIcon("D:\\Eclipse Project\\GardenApp\\src\\clementine.jpg");
		Image newimg3 = clementineicon.getImage().getScaledInstance(250, 250, java.awt.Image.SCALE_SMOOTH);
		clementineicon = new ImageIcon(newimg3);
		switch(name) {
		case "pineappleguava": return new FruitsData("PineApple Guava", pineappleguavaicon, "<html>Prized for its foliage, flowers and fruit, Acca sellowiana (Pineapple Guava) is an evergreen shrub of rounded habit or<br> small tree with handsome gray-green leaves, 1-3 in. long (2-7 cm), densely white-felted on the underside. Blooming in late spring to early summer, ravishing bicolor flowers, 1 in. across <br>(2.5 cm), bloom singly or in clusters in the leaf axils. Each blossom sports four reflexed sepals, four red petals with white tips and a showy bouquet of rich crimson stamens tipped with yellow pollen. Shining against the<br> foliage, the flamboyant flowers are edible and may be added to salads. They are followed by edible, egg-shaped, red-flushed green fruit, up to 3 in. long (7 cm). They may take 4-7 months to ripen, depending upon climate. They can be eaten fresh and have a <br>pineapple-spearmint flavor. A handsome shrub worthy of inclusion in the border, as a screen or hedge. Tolerant of drought and salt winds, Pineapple Guava is well-suited to coastal gardens. <br><ul>\r\n"
				+ "<li>Grows up to 6-15 ft. tall and wide (180-450 cm).</li>\r\n"
				+ "<li>A <strong>full sun</strong> lover, this plant is <strong>easily grown</strong> in <strong>light</strong>, <strong>evenly moist</strong>, <strong>well-drained soils</strong>. Mulch soil around the shrub to protect the shallow roots. Tolerates salt spray and drought.</li>\r\n"
				+ "<li>Perfect for <strong>wall-side borders</strong>, as a <strong>specimen or accent plant</strong>, <strong>hedges</strong>. Great in <strong>Mediterranean gardens</strong> and <strong>coastal gardens</strong>. Where not winter hardy, grow in <strong>containers</strong> to be overwintered indoors.</li>\r\n"
				+ "<li>No routine pruning necessary. Remove any winter damaged growth in late spring. Can be pruned to form a pretty hedge.</li>\r\n"
				+ "<li>Generally <strong>pest and disease free</strong>.</li>\r\n"
				+ "<li>Propagate by seed at 55-61°F (13-16°C) as soon as ripe. Propagate by semi-ripe cuttings in summer.</li>\r\n"
				+ "<li>Native to Brazil, Uruguay.</li>\r\n"
				+ "</ul></html>");
		case "kiwivine": return new FruitsData("Hardy Kiwi Vine", kiwivineicon, "<html>Grown for its attractive foliage and edible fruit, Actinidia arguta 'Issai' (Hardy Kiwi Vine) is a compact, deciduous climber that produces grape-sized, <br>smooth-skinned, green fruits in late summer to early fall. While they are smaller than grocery store varieties, they are slightly sweeter and have an excellent flavor. This kiwi cultivar is self-pollinating and does not need a companion to produce fruit. Pleasantly <br>scented flowers are borne during early summer. They are not particularly showy since they are often hidden by the foliage or broad-ovate deep green leaves. Fast-growing, this Kiwi Vine requires much less pruning than the species due to its limited growth habit. Tolerant of heat, humidity and disease <br>resistant, it is a rewarding plant with handsome foliage all summer long, delicious fruits and no serious pest issues. <br><ul>\r\n"
				+ "<li>Grows up to 12-20 ft. tall (3-6 m) and 3-5 ft. wide (1-2 m).</li>\r\n"
				+ "<li>A <strong>full sun to part shade</strong> lover, it is best grown in <strong>medium moisture</strong>, <strong>preferably acid</strong>, <strong>well-drained soils</strong>. May suffer from nutrient deficiencies on alkaline soils.</li>\r\n"
				+ "<li>Generally pest and disease free. Watch for honey fungus and phytophthora.</li>\r\n"
				+ "<li>Flowers and fruits form on last year’s growth, so annual winter pruning of each stem back to 3-4 buds beyond the last fruited stems. Summer pruning to keep the plant in check.</li>\r\n"
				+ "<li>May be propagated by softwood cuttings, grafting or layering</li>\r\n"
				+ "</ul></html>");
		case "kiwifruit": return new FruitsData("Kiwi Fruit", kiwifruiticon, "<html>Actinidia deliciosa (Kiwifruit) is a vigorous, deciduous, woody-stemmed, twining climber with broadly ovate, heart-shaped, lustrous mid-green leaves, 5-8 in. long (12-20 cm). <br>Slightly fragrant clusters of cup-shaped, creamy-white flowers are borne in late spring. Kiwifruit is dioecious, with separate male and female plants. Successful fruit production requires a female cultivar and <br>a male with viable pollen, unless a self-fertile cultivar is grown. Greenish brown, fuzzy, egg-shaped, edible fruits appear on female plants in early fall. They are sweet and tangy, their flavor somewhat reminiscent of pineapple. Kiwifruit is a frost-sensitive, temperate zone vine that requires plenty of heat to mature the fruit properly. <br>Fast-growing, Kiwifruit is a rewarding plant with handsome foliage all summer long, delicious fruits and no serious pest issues. Easy to grow in a sheltered sunny position in the garden, it is perfect for trellises, arbors, fences, or walls. <br><ul>\r\n"
				+ "<li>Grows up to 15-30 ft. tall (4-9 m) and 6-10 ft. wide (2-3 m).</li>\r\n"
				+ "<li>A <strong>full sun</strong> lover, it is best grown in <strong>fertile</strong>, <strong>medium moisture</strong>, <strong>well-drained soils</strong>. Light shade is tolerated. Provide a sheltered site. Since late spring frosts and early fall frosts could kill this vine, overhead frost protection is desirable.</li>\r\n"
				+ "<li>Generally pest and disease free.</li>\r\n"
				+ "<li>When grown for fruit, pruning is carried out in winter and summer.</li>\r\n"
				+ "<li>Take softwood cuttings in the spring or propagate by layering. Named cultivars can be grafted using whip and tongue grafting</li>\r\n"
				+ "<li>Native to China</li>\r\n"
				+ "</ul></html>");
		case "clementine": return new FruitsData("Clementine", clementineicon, "<html>Citrus clementina (Clementine) is a medium-sized, evergreen tree prized for its medium-small to medium fruit that are sweet, juicy, and easy to peel. <br>They can very easily be broken apart into 8 to 14 different segments.The flesh is deep orange, tender and melting, aromatic and less acid than oranges. The seeds are very few to medium in number, depending on cross-pollination. <br>If self-pollinated, the fruit are usually seedless. If cross-pollinated, the fruits become seedy. Highly ornamental, the tree is of moderate vigor with a round and somewhat spreading growth habit. The fine-stemmed branchlets are willowy and nearly thornless. <br>The dense foliage is highly variable in size, narrowly lanceolate and dark green. Citrus clementina is a tangor, a citrus fruit hybrid between a willowleaf mandarin orange (C. × deliciosa) and a sweet orange (C. × sinensis). <br>It is a distinctive type of mandarin and is noted for having lower heat requirement than other mandarins, which means the tolerance to fruit maturity and sensitivity to unfavorable conditions during the flowering and fruit-setting period is higher. <br>Whether planted in the ground or grown in a container, this early fruiting tree will reward you in winter with an excellent crop of juicy fruit rich in fiber, calcium, potassium, and vitamin C. <br><ul>\r\n"
				+ "<li>Grows up to 8-12 ft. tall (240-360 cm) and 4-6 ft. wide (120-180 cm).</li>\r\n"
				+ "<li>A <strong>full sun</strong> lover, this plant is <strong>easily grown</strong> in <strong>well-drained soils</strong>. <strong>Needs water regularly</strong> but cannot stand flooding or saturated soils. Water once every 1-2 weeks in spring and summer, once every 3 weeks in fall or winter.</li>\r\n"
				+ "<li>Thrives in warm climates and is hardy to 32 ºF (0ºC). Grow it indoors in a warm, sunny room and move it outdoors in late spring to a sunny spot protected from wind.</li>\r\n"
				+ "<li>Prune to your desired size.</li>\r\n"
				+ "<li>No serious pest or disease issues.</li>\r\n"
				+ "<li>Propagate by semi-hardwood cuttings and grafting.</li>\r\n"
				+ "</ul></html>");
		default:
			return null;
		}
	}
}
