// ==========================================================================
// Adarsh's TextCraft & TypoLab Studio: 15X Marathon Story Expansion Engine
// Guarantees ~15X Longer Texts (4,500 - 5,500 characters / 800+ words)
// for Every Single Story Across English A-Z, Bigrams, Case, Hard, Code,
// and Hindi स्वर, व्यंजन, मात्राएँ, साहित्य, and संयुक्त अक्षर
// ==========================================================================

import { TypingStory } from './storyDatabase';
import { DynamicWordEngine } from './dynamicWordEngine';

// Narrative chapter frameworks that weave target letter vocabulary into engaging literary stories
export function generateThematicMarathonText(
  letter: string,
  baseText: string,
  language: 'en' | 'hi',
  category: string,
  storyIndex: number
): string {
  if (language === 'en') {
    const upper = (letter || 'A').toUpperCase();
    const episodes: string[] = [];
    episodes.push(baseText);

    // Chapter narrative themes for English
    const chapterThemes = [
      "The Awakening Expedition and Ancient Lore",
      "Navigating the Labyrinth of Crystalline Whispers",
      "Deciphering Arcane Scrolls Beneath Starlit Horizons",
      "The Harmonic Confluence of Elemental Energies",
      "Ascending Toward the Celestial Summit",
      "Refining the Art of Tactile Precision",
      "The Architectural Splendor of Forgotten Citadels",
      "Mastering Rhythm and Resonant Cadence",
      "Venturing Across Untamed Astral Vistas",
      "The Triumph of Diligent Craft and Endurance",
      "Illuminating the Path of Boundless Knowledge",
      "The Synthesis of Logic, Speed, and Focus",
      "Echoes of Grandeur Across the Golden Realm",
      "Culmination at the Pinnacle of Mastery"
    ];

    if (category === 'bigram' || upper.includes('+')) {
      const parts = upper.split('+');
      const l1 = parts[0] || 'A';
      const l2 = parts[1] || 'S';

      for (let i = 0; i < 14; i++) {
        const chapterTitle = chapterThemes[(i + storyIndex * 2) % chapterThemes.length];
        const s1 = DynamicWordEngine.generateEnglishSentence(l1);
        const s2 = DynamicWordEngine.generateEnglishSentence(l2);
        const s3 = DynamicWordEngine.generateEnglishSentence(l1);
        const s4 = DynamicWordEngine.generateEnglishSentence(l2);

        const chapterText = `[Chapter ${i + 2}: ${chapterTitle} - Dual Focus ${l1}+${l2}] ${s1} ${s2} Rapid finger alternation between key '${l1}' and key '${l2}' reinforces neural speed. ${s3} ${s4}`;
        episodes.push(chapterText);
      }
    } else if (category === 'case' || upper === 'SHIFT') {
      const shiftThemes = [
        "Capitals in Astronomy and Atlas Cartography",
        "Proper Nouns Across Global Continents",
        "Scientific Taxonomy and Botanical Nomenclature",
        "Historical Monarchies and Classical Treaties",
        "Dynamic Shift Key Alternation and Left-Right Coordination",
        "Title Case Headings in Academic Journals",
        "Celestial Star Constellations and Mythic Heroes",
        "Global Financial Centers and Sovereign Currency Symbols",
        "Pioneering Inventions and Renowned Inventors",
        "Constitutional Charters and Supreme Declarations",
        "Advanced Cartography of Oceanic Currents",
        "Literary Masterpieces and Classical Playwrights",
        "Architectural Monuments of Ancient Civilizations",
        "Supreme Dexterity Across Mixed Shift Registers"
      ];

      for (let i = 0; i < 14; i++) {
        const title = shiftThemes[(i + storyIndex) % shiftThemes.length];
        const s1 = DynamicWordEngine.generateEnglishSentence('A');
        const s2 = DynamicWordEngine.generateEnglishSentence('S');
        const chapterText = `[Chapter ${i + 2}: ${title}] The North Atlantic Treaty Organization (NATO), UNESCO, and NASA launched Apollo XV toward Kepler-186f. Dr. Alexander Hamilton and Professor Beatrice Vance presented Volume XII of the Oxford English Dictionary at Harvard University. London, Tokyo, New York, Zurich, and Paris coordinated the International Monetary Fund (IMF) summit with precision. ${s1} ${s2}`;
        episodes.push(chapterText);
      }
    } else if (category === 'hard' || category === 'pro-hard' || upper === 'SYNTAX' || upper === 'CODE') {
      const codeThemes = [
        "Algorithmic Data Structures and Memory Pointers",
        "Asynchronous Event Loops and Microtask Queues",
        "Lexical Scoping, Closures, and State Management",
        "Binary Search Trees and Graph Traversals",
        "RESTful Endpoints, JSON Payloads, and HTTPS Protocols",
        "Immutable State Trees and Functional Reducers",
        "Cryptographic Hashing (SHA-256) and Cipher Keys",
        "Database Indexing (B-Trees) and SQL Transaction Logs",
        "Distributed Microservices and WebSocket Broadcasts",
        "TypeScript Generic Constraints and Utility Types",
        "Concurrent Goroutines and Channel Synchronization",
        "Compilers, AST Parsers, and Bytecode Virtual Machines",
        "High-Throughput Message Brokers (Kafka, Redis)",
        "Zero-Copy Memory Buffers and Kernel System Calls"
      ];

      for (let i = 0; i < 14; i++) {
        const title = codeThemes[(i + storyIndex) % codeThemes.length];
        const chapterText = `[Chapter ${i + 2}: ${title}] const buffer = new Uint8Array(1024); if (stream.status === 200 && payload.length > 0) { const result: Record<string, any> = { id: 0x4F, valid: true, ratio: 98.6%, timestamp: Date.now(), tags: ["#mastery", "@typolab"] }; } else { throw new Error("Fault: code [0xEE] at offset 0x7FFF; retry: true;"); }`;
        episodes.push(chapterText);
      }
    } else {
      // Standard A-Z
      for (let i = 0; i < 14; i++) {
        const chapterTitle = chapterThemes[(i + storyIndex * 2) % chapterThemes.length];
        const sentence1 = DynamicWordEngine.generateEnglishSentence(upper);
        const sentence2 = DynamicWordEngine.generateEnglishSentence(upper);
        const sentence3 = DynamicWordEngine.generateEnglishSentence(upper);
        const sentence4 = DynamicWordEngine.generateEnglishSentence(upper);

        const chapterText = `[Chapter ${i + 2}: ${chapterTitle}] ${sentence1} ${sentence2} As the narrative deepened, ${sentence3.toLowerCase()} With dedicated focus, ${sentence4.toLowerCase()}`;
        episodes.push(chapterText);
      }
    }

    return episodes.join(' ');
  } else {
    // Hindi Expansion Engine (स्वर, व्यंजन, मात्राएँ, साहित्य, संयुक्त)
    const baseEpisodes: string[] = [];
    baseEpisodes.push(baseText);

    const char = letter || 'क';
    const hindiChapterThemes = [
      "प्रथम सर्ग: ज्ञान और एकाग्रता का नव प्रभात",
      "द्वितीय सर्ग: उंगलियों की सधी हुई साधना",
      "तृतीय सर्ग: देवनागरी लिपि का अमर सौंदर्य",
      "चतुर्थ सर्ग: भाषा की शुद्धता और गति का संतुलन",
      "पंचम सर्ग: साहित्य के असीम सागर में गोते",
      "षष्ठ सर्ग: धैर्य, निष्ठा और अविराम प्रवाह",
      "सप्तम सर्ग: कठिन अक्षरों पर सहज विजय",
      "अष्टम सर्ग: विचारों की स्पष्टता और गतिशीलता",
      "नवम सर्ग: कला और तकनीक का पावन संगम",
      "दशम सर्ग: निरंतर अभ्यास से आत्मिक संतोष",
      "एकादश सर्ग: त्रुटिरहित लेखन का संकल्प",
      "द्वादश सर्ग: ज्ञान के आलोक से प्रकाशित पथ",
      "त्रयोदश सर्ग: गति और लय का अनुपम सामंजस्य",
      "चतुर्दश सर्ग: पूर्ण सिद्धि और अद्वितीय निपुणता"
    ];

    if (category === 'literature' || char === 'साहित्य') {
      const literatureThemes = [
        "मुंशी प्रेमचंद के गोदान और रंगभूमि का यथार्थ",
        "कबीरदास जी की साखी और बीजक के अमर दोहे",
        "गोस्वामी तुलसीदास कृत श्रीरामचरितमानस की चौपाइयाँ",
        "महाकवि जयशंकर प्रसाद की कामायनी का छायावादी दर्शन",
        "राष्ट्रकवि रामधारी सिंह दिनकर की रश्मिरथी का ओज",
        "सूर्यकांत त्रिपाठी 'निराला' की सरोज स्मृति",
        "महादेवी वर्मा के दीपशिखा और नीहार के भाव",
        "हरिवंश राय बच्चन की मधुशाला की जीवन दृष्टि",
        "सुमित्रानंदन पंत का प्रकृति प्रेम और ग्राम्या",
        "मैथिलीशरण गुप्त की भारत-भारती और साकेत",
        "आचार्य रामचंद्र शुक्ल का चिंतामणि निबंध संग्रह",
        "धर्मवीर भारती का गुनाहों का देवता और अंधायुग",
        "फणीश्वरनाथ 'रेणु' का मैला आंचल और आंचलिकता",
        "हिन्दी साहित्य की अजस्र ज्ञान गंगा का संगम"
      ];

      for (let i = 0; i < 14; i++) {
        const title = literatureThemes[(i + storyIndex) % literatureThemes.length];
        const s1 = DynamicWordEngine.generateHindiSentence('क');
        const s2 = DynamicWordEngine.generateHindiSentence('स');
        const para = `【अध्याय ${i + 2}: ${title}】 साहित्य समाज का दर्पण है। जब शब्द भावों के साथ मिलकर हृदय को स्पंदित करते हैं, तब भाषा की सार्थकता सिद्ध होती है। सत्य, करुणा, न्याय और मानवीय मूल्यों की रक्षा करना ही साहित्य का परम उद्देश्य है। निरंतर शुद्ध लेखन से हमारी अभिव्यक्ति में अद्भुत निपुणता आती है। ${s1} ${s2}`;
        baseEpisodes.push(para);
      }
    } else if (category === 'hard' || char === 'संयुक्त') {
      const conjunctThemes = [
        "क्ष, त्र, ज्ञ और श्र की संयुक्त ध्वनि संरचना",
        "रेफ (र्) और पदेन (्र) के सटीक नियम",
        "हलंत (्) और आधे अक्षरों की शास्त्रीय शुद्धता",
        "संस्कृत के तत्सम शब्दों में संयुक्त व्यंजन",
        "प्रकृति, प्रकाश, प्रगति और पराक्रम का अभ्यास",
        "दृष्टि, सृष्टि, उत्कृष्ट और वृष्टि का विन्यास",
        "ज्ञान, विज्ञान, प्रज्ञान और जिज्ञासा की साधना",
        "श्रम, विश्राम, परिश्रम और आश्रम का प्रवाह",
        "युद्ध, बुद्धि, शुद्धि और सिद्धि का सामंजस्य",
        "राष्ट्र, महाराष्ट्र, सौराष्ट्र और दृष्टि",
        "उज्ज्वल, प्रज्वलित, प्रज्ज्वलन और प्रज्वला",
        "आकर्षण, विकर्षण, संकर्षण और उत्कर्ष",
        "ब्रह्माण्ड, ब्राह्मण, ब्रह्मा और ब्रह्मचर्य",
        "संयुक्त अक्षरों पर पूर्ण प्रावीण्य और विजय"
      ];

      for (let i = 0; i < 14; i++) {
        const title = conjunctThemes[(i + storyIndex) % conjunctThemes.length];
        const para = `【अभ्यास ${i + 2}: ${title}】 श्रीकृष्ण ने अर्जुन को श्रीमद्भगवद्गीता का निष्काम कर्मयोग समझाया। राष्ट्र के उत्थान के लिए विद्यार्थियों का श्रम, अनुशासन, उत्कृष्ट ज्ञान और प्रखर बुद्धि आवश्यक है। वैज्ञानिक दृष्टिकोण, शास्त्रीय शुद्धता और निरंतर अभ्यास से संयुक्त वर्णों पर पूर्ण अधिकार प्राप्त होता है।`;
        baseEpisodes.push(para);
      }
    } else {
      // Standard Vowel, Consonant, Matra
      for (let i = 0; i < 14; i++) {
        const title = hindiChapterThemes[(i + storyIndex * 2) % hindiChapterThemes.length];
        const s1 = DynamicWordEngine.generateHindiSentence(char);
        const s2 = DynamicWordEngine.generateHindiSentence(char);
        const s3 = DynamicWordEngine.generateHindiSentence(char);

        const para = `【${title}】 ${s1} ${s2} इस महाभ्यास में '${char}' अक्षर और उससे जुड़े समृद्ध शब्दों का गहन अभ्यास किया जा रहा है। ${s3}`;
        baseEpisodes.push(para);
      }
    }

    return baseEpisodes.join(' ');
  }
}

// Expand any story to ~15x length (800+ words, ~4,500 - 5,500 characters)
export function expandStoryTo15X(story: TypingStory, storyIndex: number = 0): TypingStory {
  const expandedText = generateThematicMarathonText(
    story.letter || 'A',
    story.text,
    story.language,
    story.category,
    storyIndex
  );

  const wordCount = Math.round(expandedText.split(/\s+/).length);

  return {
    ...story,
    variationIndex: storyIndex,
    totalVariations: 15,
    wordCount,
    characterCount: expandedText.length,
    text: expandedText,
    subtitle: `${story.subtitle} • 15X Marathon Epic (${expandedText.length} chars, ~${wordCount} words)`
  };
}

// Synthesize and guarantee 15 distinct, hyper-long marathon variations for any given key and mode
export function expandStorySetTo15Variations(
  baseList: TypingStory[],
  letter: string,
  language: 'en' | 'hi',
  category: string
): TypingStory[] {
  const full15List: TypingStory[] = [];

  // Expand existing base stories
  baseList.forEach((story, idx) => {
    full15List.push(expandStoryTo15X(story, idx));
  });

  // If list is less than 15, synthesize additional distinct variations up to 15
  const needed = 15 - full15List.length;
  if (needed > 0) {
    const char = (letter || (language === 'en' ? 'A' : 'क')).toUpperCase();
    
    for (let i = 0; i < needed; i++) {
      const varNum = full15List.length + 1;
      let title = '';
      let subtitle = '';
      let baseText = '';

      if (language === 'en') {
        const adjectives = ["Advanced", "Arcane", "Astral", "Boundless", "Celestial", "Dynamic", "Epic", "Formidable", "Grand", "Harmonic", "Infinite", "Luminous", "Majestic", "Noble", "Pinnacle"];
        const nouns = ["Chronicle", "Expedition", "Symphony", "Odyssey", "Labyrinth", "Endurance", "Frontier", "Sanctuary", "Pinnacle", "Ascension", "Codex", "Horizon", "Mastery", "Legacy", "Triumph"];
        
        const adj = adjectives[(i * 3 + varNum) % adjectives.length];
        const noun = nouns[(i * 2 + varNum) % nouns.length];
        
        title = `${char} • The ${adj} ${noun} of Key '${char}'`;
        subtitle = `Focus: Key '${char}' Marathon Endurance Drill (Variation ${varNum}/15)`;
        
        const s1 = DynamicWordEngine.generateEnglishSentence(char);
        const s2 = DynamicWordEngine.generateEnglishSentence(char);
        const s3 = DynamicWordEngine.generateEnglishSentence(char);
        baseText = `${s1} ${s2} Dedication and rhythm accelerate tactile memory for '${char}'. ${s3}`;
      } else {
        const hiTitles = [
          "अनंत साधना और शब्द प्रवाह",
          "देवनागरी लिपि का अमर विन्यास",
          "साहित्यिक चेतना और शब्द सामर्थ्य",
          "गति, लय और शुद्धता की पराकाष्ठा",
          "अभ्यास और एकाग्रता की दिव्य यात्रा",
          "ज्ञान, विवेक और प्रखर भाषा कौशल",
          "उंगलियों का अविराम प्रवाह और सामंजस्य",
          "शुद्ध वर्तनी और उत्कृष्ट गतिशीलता",
          "भाषा का सौंदर्य और विचारों का विस्तार",
          "सिद्धि और आत्म-विश्वास का नया शिखर"
        ];
        const t = hiTitles[i % hiTitles.length];
        title = `'${letter}' • ${t}`;
        subtitle = `अभ्यास: '${letter}' अक्षर महाभ्यास (वेरिएशन ${varNum}/15)`;
        
        const s1 = DynamicWordEngine.generateHindiSentence(letter);
        const s2 = DynamicWordEngine.generateHindiSentence(letter);
        baseText = `${s1} ${s2} इस अध्याय में '${letter}' अक्षर की गति और शुद्धता को सिद्ध किया जा रहा है।`;
      }

      const rawStory: TypingStory = {
        id: `${language}-${category}-${letter.toLowerCase()}-var-${varNum}`,
        category: category as any,
        letter: letter,
        language: language,
        title: title,
        subtitle: subtitle,
        text: baseText
      };

      full15List.push(expandStoryTo15X(rawStory, varNum - 1));
    }
  }

  return full15List;
}
