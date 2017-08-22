XEvent-B Feature
================
This feature provides the eXtended Event-B (XEvent-B).

IMPORTANT:
---------
- Require XText from the update site
  http://download.eclipse.org/modeling/tmf/xtext/updates/composite/releases/

KNOWN ISSUES:
------------
- Converting to XText: Currently, the "extended" attribute of events are not serialised.

Release history:
---------------
### 0.0.7 ###
- XEvent-B Branding (0.0.3): Updated logo to XEvent-B.
- XEvent-B Common (0.0.4): Enhancement (Issue #11).
  + Machines from different projects can now be included.
  + Machines are now included using qualified name defined as: projectName.machineName
- XEvent-B Documentations (0.0.7): Update documentation for 0.0.7 release.
- XEvent-B XContext (0.0.5): Changed dependency on XText to [2.12.0, 3.0.0).
- XEvent-B XContext IDE (0.0.4): Changed dependency on XText to [2.12.0, 3.0.0).
- XEvent-B XContext UI (0.0.4): Changed dependency on XText to [2.12.0, 3.0.0).
- XEvent-B XMachine (0.0.5):
  + Changed dependency on XText to [2.12.0, 3.0.0).
  + Fixed Issue #8: Comments are not parsed.
  + Fixed Issue #10: Variants not translated: Fix is part of inclusion plug-in release 0.2.0.
  + Flattened machines now have the included machine elements generated before the source machine.
  + Order of generating elements of multiple inclusions and/or instances is from last to first.
  + This update is part of inclusion plug-in release 0.2.0.
- XEvent-B XMachine IDE (0.0.4): Changed dependency on XText to [2.12.0, 3.0.0).
- XEvent-B XMachine UI (0.0.4): 
  + Changed dependency on XText to [2.12.0, 3.0.0).
  + Regenerated from XEvent-B XMachine 0.0.5

### 0.0.6 ###
- Renamed plug-ins and features to XEvent-B (instead of Event-B XText).
- XEvent-B Branding (0.0.2): Renamed from Event-B XText Branding.
- XEvent-B Documentations (0.0.2): Renamed from Event-B XText Documentations.
- XEvent-B Cheatsheets (0.0.2): Renamed from Event-B XText Cheatsheets.
- XEvent-B Common (0.0.3): Renamed from Event-B XText Common.
- XEvent-B UI (0.0.2): Renamed from Event-B XText UI.
- XEvent-B XContext (0.0.4): Renamed from Event-B XText Context.
- XEvent-B XContext IDE (0.0.3): Renamed from Event-B XText Context IDE.
- XEvent-B XContext UI (0.0.3): Renamed from Event-B Context UI.
- XEvent-B XMachine (0.0.4): Renamed from Event-B XText Machine.
  + Support Machine Inclusion and Event Synchronisation.
- XEvent-B XMachine IDE (0.0.3): Renamed from Event-B XText Machine IDE.
- XEvent-B XMachine UI (0.0.3): Renamed from Event-B XText Machine UI.

### 0.0.5 ###
- Event-B XText Documentations (0.0.1): Documentation plug-in (Initial version).
- Event-B XText Cheatsheets (0.0.1): Cheatsheets plug-in including Basic tutorial (Initial version).

### 0.0.4 ###
- Updated plug-in dependency for the feature

### 0.0.3 ###
- Event-B XText Context (0.0.3) 
  + Issue #3: Single-line comment after the element, multi-line comment before the element
- Event-B XText Context IDE (0.0.2) Regenerated
- Event-B XText ContextUI IDE (0.0.2) Regenerated
- Event-B XText Machine (0.0.3) 
  + Issue #3: Single-line comment after the element, multi-line comment before the element
  + Issue #5: Event terminator using 'end' keyword instead of ';'
- Event-B XText Machine IDE (0.0.2) Regenerated
- Event-B XText Machine UI (0.0.2) Regenerated

### 0.0.2 ###
- Event-B XText Common (0.0.2)
  + Added transient value service for XContext and XMachine.
- Event-B XText Context (0.0.2):
  + Added formatter (used for auto-indentation).
- Event-B XText Machine (0.0.2):
  + Added formatter (used for auto-indentation).
- Event-B XText UI (0.0.1): Initial version
  + Added context menu for converting machines and contexts to XText.

### 0.0.1 Initial version contains the following plug-ins: ###
- Event-B XText Branding (0.0.1) Initial version: Branding information
- Event-B XText Common (0.0.1) Initial version: Common facilities
- Event-B XText Context (0.0.1) Initial version: Core support for Event-B contexts
- Event-B XText Context IDE (0.0.1) Initial version: IDE for Event-B contexts
- Event-B XText Context UI (0.0.1) Initial version: UI for Event-B contexts
- Event-B XText Machine (0.0.1) Initial version: Core support for Event-B machines
- Event-B XText Machine IDE (0.0.1) Initial version: IDE for Event-B machines
- Event-B XText Machine UI (0.0.1) Initial version: UI for Event-B machines
