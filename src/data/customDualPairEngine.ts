export * from './customRulePairEngine';

// Compatibility generator
import { TypingStory } from './storyDatabase';
import { DUAL_RULE_PAIRS } from './customRulePairEngine';

export function generateCustomDualPairStories(
  letter1: string,
  letter2: string,
  language: 'en' | 'hi' = 'en'
): TypingStory[] {
  const l1 = (letter1 || 'A').toUpperCase();
  const l2 = (letter2 || 'S').toUpperCase();
  const pairLabel = `${l1}+${l2}`;

  if (DUAL_RULE_PAIRS[pairLabel]) {
    return DUAL_RULE_PAIRS[pairLabel].stories.map((s, idx) => ({
      id: s.id,
      category: 'bigram',
      letter: pairLabel,
      title: s.title,
      subtitle: s.subtitle,
      language: s.language || language,
      text: s.text,
      variationIndex: idx + 1,
      totalVariations: 5
    }));
  }

  // Fallback procedural stories
  return [1, 2, 3, 4, 5].map((idx) => ({
    id: `custom-pair-${pairLabel}-${idx}`,
    category: 'bigram',
    letter: pairLabel,
    title: `Dual Coordination Drill: ${pairLabel} (Variation ${idx}/5)`,
    subtitle: `Alternating keystrokes between '${l1}' and '${l2}'`,
    language,
    text: `Alternating rapidly between key '${l1}' and key '${l2}' builds lightning-fast finger reflexes. As typists navigate complex vocabulary, rhythmically synchronizing '${l1}' and '${l2}' ensures fluid hand cadence, zero hesitation, and rock-solid tactile muscle memory across endurance tests.`,
    variationIndex: idx,
    totalVariations: 5
  }));
}
