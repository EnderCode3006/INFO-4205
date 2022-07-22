package plantdata;

import java.awt.Image;

import javax.swing.ImageIcon;

public class HerbsDataFactory {	
	public static HerbsData getHerbsData(String name) {	
		ImageIcon lemonverbenaicon = new ImageIcon("D:\\Eclipse Project\\GardenApp\\src\\LemonVerbena.jpg");
		Image newimg = lemonverbenaicon.getImage().getScaledInstance(250, 250, java.awt.Image.SCALE_SMOOTH);
		lemonverbenaicon = new ImageIcon(newimg);
		ImageIcon dillicon = new ImageIcon("D:\\Eclipse Project\\GardenApp\\src\\Dill.jpg");
		Image newimg1 = dillicon.getImage().getScaledInstance(250, 250, java.awt.Image.SCALE_SMOOTH);
		dillicon = new ImageIcon(newimg1);
		ImageIcon angelicaicon = new ImageIcon("D:\\Eclipse Project\\GardenApp\\src\\angelica.jpg");
		Image newimg2 = angelicaicon.getImage().getScaledInstance(250, 250, java.awt.Image.SCALE_SMOOTH);
		angelicaicon = new ImageIcon(newimg2);
		ImageIcon aangelicaicon = new ImageIcon("D:\\Eclipse Project\\GardenApp\\src\\american-angelica.jpg");
		Image newimg3 = aangelicaicon.getImage().getScaledInstance(250, 250, java.awt.Image.SCALE_SMOOTH);
		aangelicaicon = new ImageIcon(newimg3);
		switch (name) {
		case "lemonverbena": return new HerbsData("LemonVerbena", lemonverbenaicon, "<html>Prized for use in tisanes, liqueurs, cooking, pot-pourri, perfumes and cosmetics, award-winner Aloysia citrodora (Lemon Verbena) is a deciduous sub-shrub <br>with arching branches and narrowly lance-shaped, strongly lemon-scented, green leaves. <br>The pointed leaves are arranged in whorls of three around the stems. From mid-summer to early fall, the bush produces large terminal <br>panicles of tiny, four-petaled, white or pale lilac flowers. The leaves are best used fresh and young. They are a common ingredient in many herbal teas <br>and can be used to give a lemon flavor to fruit salads, desserts and drinks. Evergreen in warm winter areas. <br><ul>\r\n"
				+ "<li>Recipient of the prestigious <strong>Award of Garden Merit</strong> of the Royal Horticultural Society</li>\r\n"
				+ "<li>Easy to grow, Lemon Verbena grows up to 6-8 ft. high (180-240 cm) and nearly as wide.</li>\r\n"
				+ "<li>Enjoys <strong>full sun</strong> in <strong>fertile</strong>, <strong>well-drained loam</strong>. Mulch in autumn to protect the roots. In heavy frost areas grow it in a pot and bring it under protection during winter dormancy.</li>\r\n"
				+ "<li>Perfect for <strong>beds and borders</strong>, <strong> wall-side borders</strong>, <strong>city gardens</strong>, <strong>cottage gardens</strong>,<strong> Mediterranean gardens</strong>, <strong>herb gardens</strong> or <strong>containers</strong>.</li>\r\n"
				+ "<li>Generally <strong>pest and disease free</strong>.</li>\r\n"
				+ "<li>In early to mid-spring cut back the previous year's flowering stems to within one or two buds of the older woody framework.</li>\r\n"
				+ "<li>Propagate by softwood cuttings.</li>\r\n"
				+ "<li>Native to Argentina, Chile.</li>\r\n"
				+ "</ul></html>");
		case "dill": return new HerbsData("Dill", dillicon, "<html>A popular culinary herb noted for its attractive foliage and flowers, Anethum graveolens (Dill) is an upright annual <br>with feathery, aromatic, blue-green foliage and attractive flat umbels, 10 in. across (25 cm), of tiny yellow flowers in summer. <br>The showy scented blossoms are followed by small elliptical flat seeds. With a taste reminiscent of anise and parsley, the leaves may be dried or frozen for later use. <br>However, they have the best flavor when harvested fresh from the garden. Dill complements soft cheeses, white sauces, egg dishes, seafood and <br>chicken, salads, soups and vegetable dishes. Harvest the seeds after the heads have dried on the plant. <br><ul>\r\n"
				+ "<li>Grows up to 3-5 ft. tall (90-150 cm) and 2-3 ft. wide (60-90 cm). This plant self-seeds readily without being invasive. You may need to stake some tall varieties.</li>\r\n"
				+ "<li>Thrives in <strong>rich</strong>, <strong>light</strong>, <strong>well-drained soils</strong> in <strong>full sun</strong>. Shelter from strong winds. Plants appreciate consistent soil moisture. Water freely in dry conditions to inhibit bolting.</li>\r\n"
				+ "<li><strong>No serious insect or disease issues</strong>. Deer resistant, Dill attracts beneficial insects to the garden (bees, butterflies, lady beetles, etc).</li>\r\n"
				+ "<li>No pruning required. Can be left to self-seed after flowering.</li>\r\n"
				+ "<li>Propagate by seed sown in succession from spring to mid-summer. Sow seed directly in the ground just before the last spring frost date. Additional seeds may be planted every two weeks until early summer in order to extend the time when fresh leaves may be harvested.</li>\r\n"
				+ "<li>Native to Northern Africa, Arabian Peninsula.</li>\r\n"
				+ "</ul></html>");
		case "angelica": return new HerbsData("Angelica", angelicaicon, "<html>Well-known as a decoration for puddings and cakes, Angelica archangelica is a tall, aromatic, perennial herb with <br>attractive, rounded umbels, up to 4-6 in. across (10-15 cm), of white or greenish tiny flowers in early summer. The flower umbels are born on <br>bright green, hollow stems, which are sometimes tinged with purple, and give way to seeds that ripen in late summer. They rise above a foliage of <br>bright green leaves, 2 ft. in length (60 cm), which are made up of three finely toothed leaflets and make a pretty backdrop for other plants. <br><ul>\r\n"
				+ "<li>Blooming profusely from&nbsp;<strong>early to mid summer,&nbsp;</strong>Angelica is a hapaxanthic perennial, in that each year’s growth dies back to ground level after flowering and fruiting, to be replaced by fresh growth the following year.&nbsp;</li>\r\n"
				+ "<li>Grows vigorously up to 3-6 ft. high (90-180 cm) and spreads 2-4 ft. (60-90 cm).&nbsp;This plant is a biennial that produces foliage in the first year and flowers in the second year. Plants may last a third or fourth year, especially if you remove flowers.</li>\r\n"
				+ "<li>Performs best in <strong>full sun</strong> to <strong>part shade</strong>, in <strong>rich</strong>, <strong>medium to wet</strong><strong>&nbsp;soils</strong>. Plants do best in the shadiest and coolest part of the garden, especially during hot summers. Do not allow the soil&nbsp;to dry out.&nbsp;Staking may be needed in exposed sites.&nbsp;</li>\r\n"
				+ "<li><strong>Deer resistant, </strong>it <strong>attracts butterflies and beneficial insects.</strong></li>\r\n"
				+ "<li><strong>Easy to grow</strong>, Angelica is a welcomed addition to <strong>beds</strong>, <strong>borders</strong>, <strong>woodlands</strong>,&nbsp;<strong>naturalized areas</strong>, <strong>water gardens</strong>, <strong>near streams&nbsp;or pond banks</strong>.&nbsp;</li>\r\n"
				+ "<li>Plants may be grown from seed and may self-seed in optimum growing conditions if spent flower umbels are not removed.&nbsp;May be propagated by root cuttings taken in the second year.&nbsp;</li>\r\n"
				+ "<li>Cut back after flowering</li>\r\n"
				+ "<li>Susceptible when young to damage from slugs, snails, aphids, leaf miners and to powdery mildew</li>\r\n"
				+ "</ul></html>");
		case "aangelica": return new HerbsData("American Angelica", aangelicaicon, "<html>Angelica atropurpurea (American Angelica) is a large herbaceous perennial with gorgeous, rounded umbels, up to 4-10 in. across (10-25 cm), of cream <br>to greenish tiny flowers from early summer to early fall. The flower umbels are born on smooth, dark purple, hollow stems. They rise above a foliage of bright green <br>leaves adorned with 3-5 finely toothed leaflets and make a pretty backdrop for other plants. The flowers give way to dry <br>seed-like fruits. As an ornamental plant, Angelica atropurpurea is a stunning perennial, providing height and structure in the landscape. <br>Its seed head stalks hold well into winter and are quite decorative. <br><ul>\r\n"
				+ "<li>Grows up to 3-10 ft. high (90-300 cm) and 2-6 ft. wide (60-180 cm). Individual plants can vary considerably in size depending on environmental conditions.</li>\r\n"
				+ "<li>Performs best in <strong>full sun</strong> to <strong>part shade</strong>, in <strong>consistently wet to moist soils</strong>. Plants do best in the shadiest and coolest part of the garden, especially during hot summers. Standing water is well-tolerated. Staking may be needed in exposed sites.</li>\r\n"
				+ "<li>Angelica is a welcomed addition to <strong>beds and borders</strong>, <strong>woodland gardens</strong>, <strong>naturalized areas</strong>, <strong>water gardens</strong>, <strong>bog gardens</strong>, along <strong>streams or ponds</strong>.</li>\r\n"
				+ "<li><strong>No serious pest or disease issues</strong>. Deer resistant, it attracts butterflies and beneficial insects.</li>\r\n"
				+ "<li>Plants may be grown from seed and may self-seed if spent flower umbels are not removed.</li>\r\n"
				+ "<li>Native to central and eastern North America.</li>\r\n"
				+ "</ul></html>");
		default: 
			return null;
		}
	}
}
